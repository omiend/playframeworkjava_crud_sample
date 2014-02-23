
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Pager,List[Parent],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(pager: Pager, parentList: List[Parent]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

"""),_display_(Seq[Any](/*3.2*/main(pager.title)/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

    <ul class="pagination pagination-right">
      <li><a class="btn btn-default" href=""""),_display_(Seq[Any](/*6.45*/routes/*6.51*/.Application.createParent(pager.maxPageCount))),format.raw/*6.96*/("""">親レコードを作成</a></li>
      <li class=""""),_display_(Seq[Any](/*7.19*/if(pager.pageNum==1)/*7.39*/{_display_(Seq[Any](format.raw/*7.40*/("""active""")))})),format.raw/*7.47*/(""""><a href=""""),_display_(Seq[Any](/*7.59*/routes/*7.65*/.Application.index(1))),format.raw/*7.86*/("""">&laquo;</a></li>
      """),_display_(Seq[Any](/*8.8*/for(page <- pager.getPageNumList) yield /*8.41*/{_display_(Seq[Any](format.raw/*8.42*/("""<li class=""""),_display_(Seq[Any](/*8.54*/if(pager.pageNum==page)/*8.77*/{_display_(Seq[Any](format.raw/*8.78*/("""active""")))})),format.raw/*8.85*/(""""><a href=""""),_display_(Seq[Any](/*8.97*/routes/*8.103*/.Application.index(page))),format.raw/*8.127*/("""">"""),_display_(Seq[Any](/*8.130*/page)),format.raw/*8.134*/("""</a></li>""")))})),format.raw/*8.144*/("""
      <li class=""""),_display_(Seq[Any](/*9.19*/if(pager.pageNum==pager.maxPageCount)/*9.56*/{_display_(Seq[Any](format.raw/*9.57*/("""active""")))})),format.raw/*9.64*/(""""><a href=""""),_display_(Seq[Any](/*9.76*/routes/*9.82*/.Application.index(pager.maxPageCount))),format.raw/*9.120*/("""">&raquo;</a></li>
    </ul>

    <table class="table table-bordered">
      <thead>
        <th>Parent Name</th>
        <th>Child's Name</th>
      </thead>
      <tbody>
      """),_display_(Seq[Any](/*18.8*/for(parent <- parentList) yield /*18.33*/{_display_(Seq[Any](format.raw/*18.34*/("""
        <tr>
          <td>
              No."""),_display_(Seq[Any](/*21.19*/parent/*21.25*/.id)),format.raw/*21.28*/("""&nbsp;"""),_display_(Seq[Any](/*21.35*/parent/*21.41*/.name)),format.raw/*21.46*/("""<br />
              <a class="btn btn-default" href=""""),_display_(Seq[Any](/*22.49*/routes/*22.55*/.Application.editParent(pager.pageNum, parent.id))),format.raw/*22.104*/("""">更新</a>
              &nbsp;|&nbsp;
              <a class="btn btn-default" href=""""),_display_(Seq[Any](/*24.49*/routes/*24.55*/.Application.deleteParent(pager.pageNum, parent.id))),format.raw/*24.106*/("""">削除</a>
              &nbsp;|&nbsp;
              <a class="btn btn-default" href=""""),_display_(Seq[Any](/*26.49*/routes/*26.55*/.Application.createChild(pager.pageNum, parent.id))),format.raw/*26.105*/("""">子レコードを作成</a>
          </td>
          <td>
            <table class="table table-bordered">
              <tbody>
                """),_display_(Seq[Any](/*31.18*/for(child <- parent.child) yield /*31.44*/{_display_(Seq[Any](format.raw/*31.45*/("""
                <tr>
                  <td>
                      """),_display_(Seq[Any](/*34.24*/parent/*34.30*/.name)),format.raw/*34.35*/("""&nbsp;|&nbsp;No."""),_display_(Seq[Any](/*34.52*/child/*34.57*/.id)),format.raw/*34.60*/("""&nbsp;"""),_display_(Seq[Any](/*34.67*/child/*34.72*/.name)),format.raw/*34.77*/("""<br />
                      <a class="btn btn-default" href=""""),_display_(Seq[Any](/*35.57*/routes/*35.63*/.Application.editChild(pager.pageNum, child.id))),format.raw/*35.110*/("""">更新</a>
                      &nbsp;|&nbsp;
                      <a class="btn btn-default" href=""""),_display_(Seq[Any](/*37.57*/routes/*37.63*/.Application.deleteChild(pager.pageNum, child.id))),format.raw/*37.112*/("""">削除</a>
                  </td>
                </tr>
                """)))})),format.raw/*40.18*/("""
              </tbody>
            </table>
          </td>
        </tr>
      """)))})),format.raw/*45.8*/("""
      </tbody>
    </table>

    <ul class="pagination">
      <li class=""""),_display_(Seq[Any](/*50.19*/if(pager.pageNum==1)/*50.39*/{_display_(Seq[Any](format.raw/*50.40*/("""active""")))})),format.raw/*50.47*/(""""><a href=""""),_display_(Seq[Any](/*50.59*/routes/*50.65*/.Application.index(1))),format.raw/*50.86*/("""">&laquo;</a></li>
      """),_display_(Seq[Any](/*51.8*/for(page <- pager.getPageNumList) yield /*51.41*/{_display_(Seq[Any](format.raw/*51.42*/("""<li class=""""),_display_(Seq[Any](/*51.54*/if(pager.pageNum==page)/*51.77*/{_display_(Seq[Any](format.raw/*51.78*/("""active""")))})),format.raw/*51.85*/(""""><a href=""""),_display_(Seq[Any](/*51.97*/routes/*51.103*/.Application.index(page))),format.raw/*51.127*/("""">"""),_display_(Seq[Any](/*51.130*/page)),format.raw/*51.134*/("""</a></li>""")))})),format.raw/*51.144*/("""
      <li class=""""),_display_(Seq[Any](/*52.19*/if(pager.pageNum==pager.maxPageCount)/*52.56*/{_display_(Seq[Any](format.raw/*52.57*/("""active""")))})),format.raw/*52.64*/(""""><a href=""""),_display_(Seq[Any](/*52.76*/routes/*52.82*/.Application.index(pager.maxPageCount))),format.raw/*52.120*/("""">&raquo;</a></li>
    </ul>

""")))})),format.raw/*55.2*/("""
"""))}
    }
    
    def render(pager:Pager,parentList:List[Parent]): play.api.templates.HtmlFormat.Appendable = apply(pager,parentList)
    
    def f:((Pager,List[Parent]) => play.api.templates.HtmlFormat.Appendable) = (pager,parentList) => apply(pager,parentList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Feb 23 10:34:27 JST 2014
                    SOURCE: /Users/omi-swordfish/work/play/crud_java/app/views/index.scala.html
                    HASH: 4b38725ef885e7af27abe0bed50f74fb198f99c5
                    MATRIX: 786->1|920->41|957->44|982->61|1021->63|1147->154|1161->160|1227->205|1300->243|1328->263|1366->264|1404->271|1451->283|1465->289|1507->310|1567->336|1615->369|1653->370|1700->382|1731->405|1769->406|1807->413|1854->425|1869->431|1915->455|1954->458|1980->462|2022->472|2076->491|2121->528|2159->529|2197->536|2244->548|2258->554|2318->592|2533->772|2574->797|2613->798|2696->845|2711->851|2736->854|2779->861|2794->867|2821->872|2912->927|2927->933|2999->982|3120->1067|3135->1073|3209->1124|3330->1209|3345->1215|3418->1265|3588->1399|3630->1425|3669->1426|3773->1494|3788->1500|3815->1505|3868->1522|3882->1527|3907->1530|3950->1537|3964->1542|3991->1547|4090->1610|4105->1616|4175->1663|4312->1764|4327->1770|4399->1819|4503->1891|4616->1973|4728->2049|4757->2069|4796->2070|4835->2077|4883->2089|4898->2095|4941->2116|5002->2142|5051->2175|5090->2176|5138->2188|5170->2211|5209->2212|5248->2219|5296->2231|5312->2237|5359->2261|5399->2264|5426->2268|5469->2278|5524->2297|5570->2334|5609->2335|5648->2342|5696->2354|5711->2360|5772->2398|5834->2429
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|35->7|35->7|35->7|35->7|35->7|35->7|35->7|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|37->9|37->9|46->18|46->18|46->18|49->21|49->21|49->21|49->21|49->21|49->21|50->22|50->22|50->22|52->24|52->24|52->24|54->26|54->26|54->26|59->31|59->31|59->31|62->34|62->34|62->34|62->34|62->34|62->34|62->34|62->34|62->34|63->35|63->35|63->35|65->37|65->37|65->37|68->40|73->45|78->50|78->50|78->50|78->50|78->50|78->50|78->50|79->51|79->51|79->51|79->51|79->51|79->51|79->51|79->51|79->51|79->51|79->51|79->51|79->51|80->52|80->52|80->52|80->52|80->52|80->52|80->52|83->55
                    -- GENERATED --
                */
            