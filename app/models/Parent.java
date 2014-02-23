package models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import com.avaje.ebean.annotation.CreatedTimestamp;

/**
 * 親テーブルのモデルクラス
 */
@Entity
public class Parent extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    /** 名前 */
    @Required
    public String name;

    /** 子テーブルとの結合設定 */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parent")
    public List<Child> child = new ArrayList<Child>();

    /** 登録日時：日時 */
    @CreatedTimestamp
    protected Timestamp createDate;

    /** 更新日時：日時 */
    @Version
    protected Timestamp updateDate;

    public static Finder<Long,Parent> find = new Finder<Long,Parent>(Long.class, Parent.class);
}
