
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

object stat extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(searchResults: util.Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.47*/("""


"""),_display_(/*7.2*/main("FreeLancelot")/*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
    """),format.raw/*8.5*/("""<center>
        <article style="margin-top:50px;">
            <div>
            """),_display_(/*11.14*/if(searchResults != null)/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
                """),_display_(/*12.18*/for((searchTerms, searchResultlist) <- searchResults) yield /*12.71*/{_display_(Seq[Any](format.raw/*12.72*/("""
                    """),format.raw/*13.21*/("""<p>Search terms : """),_display_(/*13.40*/searchTerms),format.raw/*13.51*/(""" """),format.raw/*13.52*/(""": Flesh reading Ease Index ## FKGL #.#</p>
                    <table>
                        """),_display_(/*15.26*/for(result <- searchResultlist.getResult()) yield /*15.69*/{_display_(Seq[Any](format.raw/*15.70*/("""
                            """),format.raw/*16.29*/("""<tr>
                                <td>"""),_display_(/*17.38*/result/*17.44*/.getWordStats()),format.raw/*17.59*/("""</td>
                            </tr>
                        """)))}),format.raw/*19.26*/("""
                    """),format.raw/*20.21*/("""</table>
                """)))}),format.raw/*21.18*/("""
            """)))}),format.raw/*22.14*/("""
            """),format.raw/*23.13*/("""</div>
        </article>
    </center>
""")))}))
      }
    }
  }

  def render(searchResults:util.Map[String, Resultlist]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((util.Map[String, Resultlist]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/stat.scala.html
                  HASH: fa93d676098ddce22ae646186fb0d7fb57268e23
                  MATRIX: 610->1|649->35|680->61|1022->80|1162->125|1194->132|1222->152|1261->154|1293->160|1406->246|1440->271|1480->273|1526->292|1595->345|1634->346|1684->368|1730->387|1762->398|1791->399|1916->497|1975->540|2014->541|2072->571|2142->614|2157->620|2193->635|2291->702|2341->724|2399->751|2445->766|2487->780
                  LINES: 23->1|24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|46->15|46->15|46->15|47->16|48->17|48->17|48->17|50->19|51->20|52->21|53->22|54->23
                  -- GENERATED --
              */
          