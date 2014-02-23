package models;

import java.util.ArrayList;
import java.util.List;

public class Pager {

    /** title */
    public String title = "crud_java";

    /** 現在のページ番号 */
    public int pageNum = 1;

    /** 最大ページ数 */
    public int maxPageCount = 0;

    /** １ページに表時するデータの件数 */
    public final int maxListCount = 5;

    /** 現在ページの両脇ページ番号を表示する件数 */
    public final int behindAndFrontCount = 2;

    /** コンストラクタ */
    public Pager() {
    }

    /**
     * ページ番号リストを取得する<br />
     * 指定したページ番号が常に中心に位置し、前後に{listNum}件のページ番号を表示する。
     */
    public List<Integer> getPageNumList() {
        List<Integer> pageNumList = new ArrayList<Integer>();
        //
        // 指定したページ番号が最大ページ数よりも大きい番号だったら、最大ページ数{-listNum*2}から処理
        // そうでない場合は指定したページ数{-listNum}から処理
        // {listNum*2+1}件になるまで処理
        for (int i = (this.pageNum + this.behindAndFrontCount + 1 > this.maxPageCount ? this.maxPageCount - (this.behindAndFrontCount * 2) : this.pageNum - this.behindAndFrontCount);
        pageNumList.size() < (this.behindAndFrontCount * 2 + 1) && pageNumList.size() < this.maxPageCount;
             i++) {
            if (i >= 1 && this.maxPageCount >= i) {
                pageNumList.add(i);
            }
        }
        return pageNumList;
    }
}
