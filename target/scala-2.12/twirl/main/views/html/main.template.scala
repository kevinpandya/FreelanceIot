
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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <style>
        #hiddenId"""),format.raw/*18.18*/("""{"""),format.raw/*18.19*/("""
            """),format.raw/*19.13*/("""visibility: hidden;
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""</style>

    <!--
    <script src='"""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("javascripts/prism.js")),format.raw/*24.66*/("""' type="text/javascript"></script>
	 -->
</head>

<body>
    """),_display_(/*29.6*/content),format.raw/*29.13*/("""


    """),format.raw/*32.5*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src='"""),_display_(/*33.19*/routes/*33.25*/.Assets.versioned("javascripts/index.js")),format.raw/*33.66*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*34.19*/routes/*34.25*/.Assets.versioned("javascripts/main.js")),format.raw/*34.65*/("""' type="text/javascript"></script>

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
                  HASH: 681ef2bae5b72bbddd4918d5d685b333ad0a96bc
                  MATRIX: 1171->266|1296->296|1326->300|1410->357|1436->362|1522->421|1537->427|1599->468|1684->526|1699->532|1760->571|1916->699|1945->700|1987->714|2043->743|2072->744|2105->750|2172->790|2187->796|2249->837|2342->904|2370->911|2407->921|2542->1029|2557->1035|2619->1076|2700->1130|2715->1136|2776->1176
                  LINES: 32->7|37->7|39->9|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|48->18|48->18|49->19|50->20|50->20|51->21|54->24|54->24|54->24|59->29|59->29|62->32|63->33|63->33|63->33|64->34|64->34|64->34
                  -- GENERATED --
              */
          