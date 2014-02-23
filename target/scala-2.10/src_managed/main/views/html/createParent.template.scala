
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
object createParent extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Integer,Form[Parent],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, pageNum: Integer, parentForm: Form[Parent]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.61*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main(title)/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""

    """),_display_(Seq[Any](/*6.6*/form(routes.Application.insertParent(pageNum))/*6.52*/ {_display_(Seq[Any](format.raw/*6.54*/("""

        <fieldset>

            """),_display_(Seq[Any](/*10.14*/inputText(parentForm("name"), '_label -> "Parent name"))),format.raw/*10.69*/("""

        </fieldset>

        <div class="actions">
            <input type="submit" value="Create this Parent" class="btn primary"> or
            <a href=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Application.index(pageNum))),format.raw/*16.56*/("""" class="btn">Cancel</a>
        </div>

    """)))})),format.raw/*19.6*/("""

""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(title:String,pageNum:Integer,parentForm:Form[Parent]): play.api.templates.HtmlFormat.Appendable = apply(title,pageNum,parentForm)
    
    def f:((String,Integer,Form[Parent]) => play.api.templates.HtmlFormat.Appendable) = (title,pageNum,parentForm) => apply(title,pageNum,parentForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Feb 23 10:34:25 JST 2014
                    SOURCE: /Users/omi-swordfish/work/play/crud_java/app/views/createParent.scala.html
                    HASH: 2ba8dd138814b343f0580b7bf913183c4d4ca8da
                    MATRIX: 802->1|972->60|1000->80|1037->83|1056->94|1095->96|1138->105|1192->151|1231->153|1306->192|1383->247|1584->412|1599->418|1648->445|1728->494|1764->499
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|34->6|38->10|38->10|44->16|44->16|44->16|47->19|49->21
                    -- GENERATED --
                */
            