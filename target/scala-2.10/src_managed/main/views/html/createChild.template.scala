
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object createChild extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Integer,Long,Form[Child],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, pageNum: Integer, parentId: Long, childForm: Form[Child]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.75*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main(title)/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""

    """),_display_(Seq[Any](/*6.6*/form(routes.Application.insertChild(pageNum, parentId))/*6.61*/ {_display_(Seq[Any](format.raw/*6.63*/("""

        <fieldset>

            """),_display_(Seq[Any](/*10.14*/inputText(childForm("name"), '_label -> "Child name"))),format.raw/*10.67*/("""

        </fieldset>

        <div class="actions">
            <input type="submit" value="Create this Child" class="btn primary"> or
            <a href=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Application.index(pageNum))),format.raw/*16.56*/("""" class="btn">Cancel</a>
        </div>

    """)))})),format.raw/*19.6*/("""

""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(title:String,pageNum:Integer,parentId:Long,childForm:Form[Child]): play.api.templates.HtmlFormat.Appendable = apply(title,pageNum,parentId,childForm)
    
    def f:((String,Integer,Long,Form[Child]) => play.api.templates.HtmlFormat.Appendable) = (title,pageNum,parentId,childForm) => apply(title,pageNum,parentId,childForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Feb 23 10:34:25 JST 2014
                    SOURCE: /Users/omi-swordfish/work/play/crud_java/app/views/createChild.scala.html
                    HASH: 8e2cdb800a36c703469b36aa92eafa16ca29693a
                    MATRIX: 805->1|989->74|1017->94|1054->97|1073->108|1112->110|1155->119|1218->174|1257->176|1332->215|1407->268|1607->432|1622->438|1671->465|1751->514|1787->519
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|34->6|38->10|38->10|44->16|44->16|44->16|47->19|49->21
                    -- GENERATED --
                */
            