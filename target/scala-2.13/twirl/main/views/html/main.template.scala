
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*14.50*/routes/*14.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.97*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("images/favicon.png")),format.raw/*15.100*/("""'>
    <style>
        #hiddenId"""),format.raw/*17.18*/("""{"""),format.raw/*17.19*/("""
            """),format.raw/*18.13*/("""visibility: hidden;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""</style>

    <!--
    <script src='"""),_display_(/*23.19*/routes/*23.25*/.Assets.versioned("javascripts/prism.js")),format.raw/*23.66*/("""' type="text/javascript"></script>
	 -->
</head>

<body>
    """),_display_(/*28.6*/content),format.raw/*28.13*/("""

    """),format.raw/*30.5*/("""<script src='"""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("javascripts/index.js")),format.raw/*30.66*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*31.19*/routes/*31.25*/.Assets.versioned("javascripts/main.js")),format.raw/*31.65*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*32.19*/routes/*32.25*/.Assets.versioned("javascripts/jquery.min.js")),format.raw/*32.71*/("""' type="text/javascript"></script>

</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 03c95b2c4c42dbd24e0ee97e30fd48dc21bf1096
                  MATRIX: 1170->266|1295->296|1325->300|1409->357|1435->362|1521->421|1536->427|1598->468|1683->526|1698->532|1759->571|1821->605|1850->606|1892->620|1948->649|1977->650|2010->656|2077->696|2092->702|2154->743|2247->810|2275->817|2310->825|2351->839|2366->845|2428->886|2509->940|2524->946|2585->986|2666->1040|2681->1046|2748->1092
                  LINES: 32->7|37->7|39->9|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|47->17|47->17|48->18|49->19|49->19|50->20|53->23|53->23|53->23|58->28|58->28|60->30|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32
                  -- GENERATED --
              */
          