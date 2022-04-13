
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
import scala.collection.JavaConverters._

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
                  HASH: 0f828c155a7a2866635d0f2325a9358360181f19
                  MATRIX: 1171->266|1296->296|1326->300|1410->357|1436->362|1522->421|1537->427|1599->468|1684->526|1699->532|1760->571|1822->605|1851->606|1893->620|1949->649|1978->650|2011->656|2078->696|2093->702|2155->743|2248->810|2276->817|2311->825|2352->839|2367->845|2429->886|2510->940|2525->946|2586->986|2667->1040|2682->1046|2749->1092
                  LINES: 32->7|37->7|39->9|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|47->17|47->17|48->18|49->19|49->19|50->20|53->23|53->23|53->23|58->28|58->28|60->30|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32
                  -- GENERATED --
              */
          