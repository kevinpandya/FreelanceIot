
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
                  HASH: 8dc5c7ac03d647cd70ccae87407c853c0e00212b
                  MATRIX: 611->1|650->35|995->61|1130->101|1162->108|1190->128|1229->130|1257->132|1343->192|1377->217|1417->219|1449->225|1518->278|1557->279|1589->284|1629->297|1661->308|1690->309|1868->461|1927->504|1966->505|1999->511|2051->536|2066->542|2132->587|2162->590|2177->596|2212->610|2260->631|2275->637|2306->647|2350->664|2365->670|2397->681|2441->698|2456->704|2487->714|2531->731|2585->769|2624->770|2659->778|2699->791|2714->797|2763->825|2793->828|2817->831|2864->848|2898->855|2951->878|2983->883|3027->897|3063->903|3094->907
                  LINES: 23->1|24->2|29->3|34->3|37->6|37->6|37->6|38->7|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|52->21|52->21|52->21|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|63->32|64->33|65->34|66->35|67->36
                  -- GENERATED --
              */
          