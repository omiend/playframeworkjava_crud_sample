
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html lang="en">
  <head>
    <title>"""),_display_(Seq[Any](/*7.13*/title)),format.raw/*7.18*/("""</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*12.55*/routes/*12.61*/.Assets.at("images/favicon.png"))),format.raw/*12.93*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.50*/routes/*13.56*/.Assets.at("stylesheets/main.css"))),format.raw/*13.90*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.50*/routes/*14.56*/.Assets.at("bootstrap/css/bootstrap.css"))),format.raw/*14.97*/("""">
  </head>
  <body>

    <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/">CRUD JAVA</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="/">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </div><!-- /.navbar -->

    <div class="container">

      <div class="row row-offcanvas row-offcanvas-right">

        <div class="col-xs-12 col-sm-9">
          """),_display_(Seq[Any](/*44.12*/if(flash.containsKey("info"))/*44.41*/ {_display_(Seq[Any](format.raw/*44.43*/("""<p class="bg-success">"""),_display_(Seq[Any](/*44.66*/flash/*44.71*/.get("info"))),format.raw/*44.83*/("""</p>""")))})),format.raw/*44.88*/(""" 
          """),_display_(Seq[Any](/*45.12*/if(flash.containsKey("worning"))/*45.44*/ {_display_(Seq[Any](format.raw/*45.46*/("""<p class="bg-warning">"""),_display_(Seq[Any](/*45.69*/flash/*45.74*/.get("warning"))),format.raw/*45.89*/("""</p>""")))})),format.raw/*45.94*/(""" 
          """),_display_(Seq[Any](/*46.12*/if(flash.containsKey("error"))/*46.42*/ {_display_(Seq[Any](format.raw/*46.44*/("""<p class="bg-danger">"""),_display_(Seq[Any](/*46.66*/flash/*46.71*/.get("error"))),format.raw/*46.84*/("""</p>""")))})),format.raw/*46.89*/(""" 
          """),_display_(Seq[Any](/*47.12*/content)),format.raw/*47.19*/("""
        </div><!--/span-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
          <div class="list-group">
            <a href="#" class="list-group-item active">Link</a>
            <a href="#" class="list-group-item">Link</a>
          </div>
        </div><!--/span-->
      </div><!--/row-->

      <hr>

      <footer>
        <p>&copy; omiend 2013</p>
      </footer>

    </div><!--/.container-->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*70.42*/routes/*70.48*/.Assets.at("bootstrap/js/bootstrap.min.js"))),format.raw/*70.91*/(""""></script>

  </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Feb 23 10:34:27 JST 2014
                    SOURCE: /Users/omi-swordfish/work/play/crud_java/app/views/main.scala.html
                    HASH: cd464b0657fe7ddb657753916b1c3a423c69c0a0
                    MATRIX: 778->1|902->31|994->88|1020->93|1331->368|1346->374|1400->406|1488->458|1503->464|1559->498|1647->550|1662->556|1725->597|2812->1648|2850->1677|2890->1679|2949->1702|2963->1707|2997->1719|3034->1724|3083->1737|3124->1769|3164->1771|3223->1794|3237->1799|3274->1814|3311->1819|3360->1832|3399->1862|3439->1864|3497->1886|3511->1891|3546->1904|3583->1909|3632->1922|3661->1929|4416->2648|4431->2654|4496->2697
                    LINES: 26->1|29->1|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|72->44|72->44|72->44|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|74->46|74->46|75->47|75->47|98->70|98->70|98->70
                    -- GENERATED --
                */
            