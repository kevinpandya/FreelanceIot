
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchResults: Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.42*/("""

"""),_display_(/*5.2*/main("FreeLancelot")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""<center>
	<article style="margin-top:50px;">
	<h1>Welcome to FreeLancelot</h1>
	<form action="/" method="GET">
		<input type="text" name="searchPhrase" placeholder="Enter search terms"/>
		<input type="submit" value="Go!" />
	</form>
	<div>
		"""),_display_(/*14.4*/if(searchResults != null)/*14.29*/ {_display_(Seq[Any](format.raw/*14.31*/("""
			"""),_display_(/*15.5*/for((searchTerms, searchResultlist) <- searchResults) yield /*15.58*/{_display_(Seq[Any](format.raw/*15.59*/("""
				"""),format.raw/*16.5*/("""<p>Search terms : """),_display_(/*16.24*/searchTerms),format.raw/*16.35*/(""" """),format.raw/*16.36*/(""": Flesh reading Ease Index ## FKGL #.#</p>
				<a href=""""),_display_(/*17.15*/routes/*17.21*/.HomeController.wordStat(searchTerms)),format.raw/*17.58*/("""">Global Stats</a>
				<table>
				<tr>
					<th>Owner_id</th>
					<th>Date</th>
					<th>Title</th>
					<th>Type</th>
					<th>Skills</th>
				</tr>
				"""),_display_(/*26.6*/for(result <- searchResultlist.getResult()) yield /*26.49*/{_display_(Seq[Any](format.raw/*26.50*/("""
					"""),format.raw/*27.6*/("""<tr>
						<td><a href='"""),_display_(/*28.21*/routes/*28.27*/.HomeController.profile(result.getOwner_id())),format.raw/*28.72*/("""'>"""),_display_(/*28.75*/result/*28.81*/.getOwner_id()),format.raw/*28.95*/("""</a></td>
						<td>"""),_display_(/*29.12*/result/*29.18*/.getDate()),format.raw/*29.28*/("""</td>
						<td>"""),_display_(/*30.12*/result/*30.18*/.getTitle()),format.raw/*30.29*/("""</td>
						<td>"""),_display_(/*31.12*/result/*31.18*/.getType()),format.raw/*31.28*/("""</td>
						<td>"""),_display_(/*32.12*/for((key,value) <- result.getSkills()) yield /*32.50*/{_display_(Seq[Any](format.raw/*32.51*/("""
								"""),format.raw/*33.9*/("""<u><a href=""""),_display_(/*33.22*/routes/*33.28*/.HomeController.skill(value,key)),format.raw/*33.60*/("""" target="_blank">"""),_display_(/*33.79*/key),format.raw/*33.82*/("""</a></u>
							""")))}),format.raw/*34.9*/("""
						"""),format.raw/*35.7*/("""</td>
						<td><a href=""""),_display_(/*36.21*/routes/*36.27*/.HomeController.indvStat(result.getPrevDesc())),format.raw/*36.73*/("""">Stats</a></td>
						<td><a href=#>Readability</a></td>
					</tr>
				""")))}),format.raw/*39.6*/("""
				"""),format.raw/*40.5*/("""</table>
			""")))}),format.raw/*41.5*/("""
		""")))}),format.raw/*42.4*/("""
	"""),format.raw/*43.2*/("""</div>
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
                  SOURCE: app/views/index.scala.html
                  HASH: 6cf4c9aeaedfa38e31bf0198c7840f5518903688
                  MATRIX: 610->1|649->35|994->61|1129->101|1159->106|1187->126|1226->128|1254->130|1532->382|1566->407|1606->409|1638->415|1707->468|1746->469|1779->475|1825->494|1857->505|1886->506|1971->564|1986->570|2044->607|2236->773|2295->816|2334->817|2368->824|2421->850|2436->856|2502->901|2532->904|2547->910|2582->924|2631->946|2646->952|2677->962|2722->980|2737->986|2769->997|2814->1015|2829->1021|2860->1031|2905->1049|2959->1087|2998->1088|3035->1098|3075->1111|3090->1117|3143->1149|3189->1168|3213->1171|3261->1189|3296->1197|3350->1224|3365->1230|3432->1276|3539->1353|3572->1359|3616->1373|3651->1378|3681->1381
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|48->17|48->17|57->26|57->26|57->26|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|70->39|71->40|72->41|73->42|74->43
                  -- GENERATED --
              */
          