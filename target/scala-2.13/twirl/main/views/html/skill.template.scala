
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

object skill extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchResults: Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.42*/("""


"""),_display_(/*6.2*/main("FreeLancelot")/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
"""),format.raw/*7.1*/("""<center>
	<article style="margin-top:50px;">
		<div>
			"""),_display_(/*10.5*/if(searchResults != null)/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
			"""),_display_(/*11.5*/for((searchTerms, searchResultlist) <- searchResults) yield /*11.58*/{_display_(Seq[Any](format.raw/*11.59*/("""
			"""),format.raw/*12.4*/("""<h1>Skill : """),_display_(/*12.17*/searchTerms),format.raw/*12.28*/(""" """),format.raw/*12.29*/("""</h1>
			<table>
				<tr>
					<th>Owner_id</th>
					<th>Date</th>
					<th>Title</th>
					<th>Type</th>
					<th>Skills</th>
				</tr>
				"""),_display_(/*21.6*/for(result <- searchResultlist.getResult()) yield /*21.49*/{_display_(Seq[Any](format.raw/*21.50*/("""
				"""),format.raw/*22.5*/("""<tr>
					<td><a href='"""),_display_(/*23.20*/routes/*23.26*/.HomeController.profile(result.getOwner_id())),format.raw/*23.71*/("""'>"""),_display_(/*23.74*/result/*23.80*/.getOwner_id()),format.raw/*23.94*/("""</a></td>
					<td>"""),_display_(/*24.11*/result/*24.17*/.getDate()),format.raw/*24.27*/("""</td>
					<td>"""),_display_(/*25.11*/result/*25.17*/.getTitle()),format.raw/*25.28*/("""</td>
					<td>"""),_display_(/*26.11*/result/*26.17*/.getType()),format.raw/*26.27*/("""</td>
					<td>"""),_display_(/*27.11*/for((key,value) <- result.getSkills()) yield /*27.49*/{_display_(Seq[Any](format.raw/*27.50*/("""
						"""),format.raw/*28.7*/("""<u><a href=""""),_display_(/*28.20*/routes/*28.26*/.HomeController.skill(value)),format.raw/*28.54*/("""">"""),_display_(/*28.57*/key),format.raw/*28.60*/("""</a></u>
						""")))}),format.raw/*29.8*/("""
					"""),format.raw/*30.6*/("""</td>
				</tr>
				""")))}),format.raw/*32.6*/("""
			"""),format.raw/*33.4*/("""</table>
			""")))}),format.raw/*34.5*/("""
			""")))}),format.raw/*35.5*/("""
		"""),format.raw/*36.3*/("""</div>
	</article>
</center>
""")))}))
      }
    }
  }

  def render(searchResults:Map[String, Resultlist]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((Map[String, Resultlist]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/skill.scala.html
                  HASH: a0f07b25486ded8dedd9c4d98ceaca8169941777
                  MATRIX: 610->1|649->35|994->61|1129->101|1161->108|1189->128|1228->130|1256->132|1342->192|1376->217|1416->219|1448->225|1517->278|1556->279|1588->284|1628->297|1660->308|1689->309|1867->461|1926->504|1965->505|1998->511|2050->536|2065->542|2131->587|2161->590|2176->596|2211->610|2259->631|2274->637|2305->647|2349->664|2364->670|2396->681|2440->698|2455->704|2486->714|2530->731|2584->769|2623->770|2658->778|2698->791|2713->797|2762->825|2792->828|2816->831|2863->848|2897->855|2950->878|2982->883|3026->897|3062->903|3093->907
                  LINES: 23->1|24->2|29->3|34->3|37->6|37->6|37->6|38->7|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|52->21|52->21|52->21|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|63->32|64->33|65->34|66->35|67->36
                  -- GENERATED --
              */
          