
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
/*1.2*/import model.Searchphraseresult
/*2.2*/import model.Resultlist
/*3.2*/import java.util

object indvstat extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.Map[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(searchResults: util.Map[String, Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.44*/("""


    """),_display_(/*7.6*/main("FreeLancelot")/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
        """),format.raw/*8.9*/("""<center>
            <article style="margin-top:50px;">
                <div>
                    <table style="width: 30%; border: black 1px solid">
                    """),_display_(/*12.22*/for((key, value) <- searchResults) yield /*12.56*/ {_display_(Seq[Any](format.raw/*12.58*/("""
                        """),format.raw/*13.25*/("""<tr>
                            <td>"""),_display_(/*14.34*/key),format.raw/*14.37*/("""</td>
                            <td>"""),_display_(/*15.34*/value),format.raw/*15.39*/("""</td>
                        </tr>
                    """)))}),format.raw/*17.22*/("""
                    """),format.raw/*18.21*/("""</table>
                </div>
            </article>
        </center>
    """)))}))
      }
    }
  }

  def render(searchResults:util.Map[String, Integer]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((util.Map[String, Integer]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/indvstat.scala.html
                  HASH: ce7766514b4492582f6895ae0ff9cd1da9c6920d
                  MATRIX: 610->1|649->35|680->61|1023->80|1160->122|1196->133|1224->153|1263->155|1299->165|1501->340|1551->374|1591->376|1645->402|1711->441|1735->444|1802->484|1828->489|1918->548|1968->570
                  LINES: 23->1|24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|48->17|49->18
                  -- GENERATED --
              */
          