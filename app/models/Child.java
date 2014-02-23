package models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import com.avaje.ebean.annotation.CreatedTimestamp;

/**
 * 子テーブルのモデルクラス
 */
@Entity
public class Child extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    /** 名前 */
    @Required
    public String name;

    /** 親テーブルとの結合設定 */
    @ManyToOne
    @JoinColumn(name = "child")
    public Parent parent;

    /** 登録日時：日時 */
    @CreatedTimestamp
    protected Timestamp createDate;

    /** 更新日時：日時 */
    @Version
    protected Timestamp updateDate;

    public static Finder<Long,Child> find = new Finder<Long,Child>(Long.class, Child.class);
}
