
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
object editChild extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Integer,Long,Form[Child],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, pageNum: Integer, id: Long, childForm: Form[Child]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(title)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(Seq[Any](/*7.6*/form(routes.Application.updateChild(pageNum, id))/*7.55*/ {_display_(Seq[Any](format.raw/*7.57*/("""

        <fieldset>

            """),_display_(Seq[Any](/*11.14*/inputText(childForm("name"), '_label -> "Child name"))),format.raw/*11.67*/("""

        </fieldset>

        <div class="actions">
            <input type="submit" value="Update this Child" class="btn primary"> or
            <a href=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Application.index(pageNum))),format.raw/*17.56*/("""" class="btn">Cancel</a>
        </div>

    """)))})),format.raw/*20.6*/("""

""")))})),format.raw/*22.2*/("""
"""))}
    }
    
    def render(title:String,pageNum:Integer,id:Long,childForm:Form[Child]): play.api.templates.HtmlFormat.Appendable = apply(title,pageNum,id,childForm)
    
    def f:((String,Integer,Long,Form[Child]) => play.api.templates.HtmlFormat.Appendable) = (title,pageNum,id,childForm) => apply(title,pageNum,id,childForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Feb 23 10:34:26 JST 2014
                    SOURCE: /Users/omi-swordfish/work/play/crud_java/app/views/editChild.scala.html
                    HASH: 2b49d29280da8d50ecfff422200f0c4239c7cd85
                    MATRIX: 803->1|981->68|1011->90|1048->93|1067->104|1106->106|1149->115|1206->164|1245->166|1320->205|1395->258|1595->422|1610->428|1659->455|1739->504|1775->509
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|39->11|39->11|45->17|45->17|45->17|48->20|50->22
                    -- GENERATED --
                */
            