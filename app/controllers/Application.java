package controllers;

import static play.data.Form.form;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;

import models.Child;
import models.Pager;
import models.Parent;
import play.api.mvc.RequestHeader;
import play.data.Form;
import play.mvc.*;

import views.html.*;

/**
 * PlayFramwork 2.1.0<br />
 * Java版
 */
public class Application extends Controller {

    /**
     * トップ画面起動
     */
    public static Result index(int pageNum) {

        // Pager初期化
        Pager pager = new Pager();

        // 現在ページを設定
        pager.pageNum = pageNum;

        // Parentを検索
        List<Parent> parentList = Parent.find.setFirstRow(pager.pageNum * pager.maxListCount - pager.maxListCount).setMaxRows(pager.maxListCount).findList();

        // データ件数取得
        int rowCount = Parent.find.findRowCount();

        // 最大ページ数（データ件数／１ページのデータ出力件数）
        pager.maxPageCount = rowCount / pager.maxListCount;

        // 余りデータが存在する場合は＋１ページする
        if (rowCount % pager.maxListCount != 0) {
            pager.maxPageCount++;
        }

        return ok(index.render(pager, parentList));
    }

    /**
     * 親テーブル作成画面起動処理
     */
    public static Result createParent(int pageNum) {
        Form<Parent> parentForm = form(Parent.class);
        return ok(createParent.render("Create Parent － CRUD", pageNum, parentForm));
    }

    /**
     * 親テーブル作成処理
     */
    public static Result insertParent(int pageNum) {
        Form<Parent> parentForm = form(Parent.class).bindFromRequest();
        if(parentForm.hasErrors()) {
            return badRequest(createParent.render("Create Parent － CRUD", pageNum, parentForm));
        }
        parentForm.get().save();
        flash("success", "Parent " + parentForm.get().name + " has been created");
        return redirect(routes.Application.index(pageNum));
    }

    /**
     * 親テーブル更新画面起動処理
     */
    public static Result editParent(int pageNum, Long id) {
        Form<Parent> parentForm = form(Parent.class).fill(Parent.find.byId(id));
        return ok(editParent.render("Edit Parent － CRUD", pageNum, id, parentForm));
    }

    /**
     * 親テーブル更新処理
     */
    public static Result updateParent(int pageNum, Long id) {
        Form<Parent> parentForm = form(Parent.class).bindFromRequest();
        if(parentForm.hasErrors()) {
            flash("error", "Computer has been error");
            return badRequest(editParent.render("Edit Parent － CRUD", pageNum, id, parentForm));
        }
        Parent oldParent = Parent.find.setId(id).findUnique();
        Parent newParent = parentForm.get();
        // 子テーブルをコピー
        newParent.child = oldParent.child;
        newParent.update(id);

        flash("info", "Parent has been info");
        flash("warning", "Parent has been warning");

        return redirect(routes.Application.index(pageNum));
    }

    /**
     * 親テーブル削除処理
     */
    public static Result deleteParent(int pageNum, Long id) {
        Parent parent = Parent.find.setId(id).findUnique();
        parent.delete();
        return redirect(routes.Application.index(pageNum));
    }

    /**
     * 子テーブル作成処理画面起動処理
     */
    public static Result createChild(int pageNum, Long parentId) {
        Form<Child> childForm = form(Child.class);
        return badRequest(createChild.render("Create Child － CRUD", pageNum, parentId, childForm));
    }

    /**
     * 子テーブル作成処理
     */
    public static Result insertChild(int pageNum, Long parentId) {
        Form<Child> childForm = form(Child.class).bindFromRequest();
        if(childForm.hasErrors()) {
            return badRequest(createChild.render("Create Child － CRUD", pageNum, parentId, childForm));
        }

        // 新規作成子テーブルを取得
        Child newChild = childForm.get();

        // 親テーブルを取得
        Parent parent = Parent.find.setId(parentId).findUnique();

        // 親テーブルと子テーブルを紐づけ
        newChild.parent = parent;

        // 登録処理
        newChild.save();
        flash("success", "Child " + childForm.get().name + " has been created");
        return redirect(routes.Application.index(pageNum));
    }

    /**
     * 子テーブル更新処理起動処理
     */
    public static Result editChild(int pageNum, Long id) {
        Form<Child> parentForm = form(Child.class).fill(Child.find.byId(id));
        return ok(editChild.render("Edit Parent － CRUD", pageNum, id, parentForm));
    }

    /**
     * 子テーブル更新処理
     */
    public static Result updateChild(int pageNum, Long id) {
        Form<Child> childForm = form(Child.class).bindFromRequest();
        if(childForm.hasErrors()) {
            flash("error", "Computer has been error");
            return badRequest(editChild.render("Edit Child － CRUD", pageNum, id, childForm));
        }
        Child newChild = childForm.get();
        newChild.update(id);

        flash("info", "Computer has been info");
        flash("warning", "Computer has been warning");

        return redirect(routes.Application.index(pageNum));
    }

    /**
     * 子テーブル削除処理
     */
    public static Result deleteChild(int pageNum, Long id) {
        Child child = Child.find.setId(id).findUnique();
        child.delete();
        return redirect(routes.Application.index(pageNum));
    }

    /**
     * テストデータ作成処理
     */
    public static Result initTestData(int pIndex, int cIndex) {

        List<Parent> deleteList = Parent.find.findList();
        for (Parent delete : deleteList) {
            delete.delete();
        }


        for (int i = 0; i < pIndex; i++) {
            Parent parent = new Parent();
            parent.name = "親名" + String.valueOf(i + 1);

            for (int j = 0; j < cIndex; j++) {
                Child child = new Child();
                child.name = "子名" + String.valueOf(j + 1);;
                parent.child.add(child);
            }

            parent.save();
        }
        return redirect(routes.Application.index(1));
    }
}
