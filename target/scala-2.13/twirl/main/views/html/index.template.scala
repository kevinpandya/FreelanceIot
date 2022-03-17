
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
	"""),format.raw/*6.2*/("""<center>
		<article style="margin-top:50px;">
			<h1>Welcome to FreeLancelot</h1>
			<form action="/" method="GET">
				<input type="text" name="searchPhrase" placeholder="Enter search terms"/>
				<input id="submitbtn" type="submit" value="Go!" />
				<br />
				<input type="text" id="hiddenId" name="sessionId" value="" />
			</form>
			<div>
			"""),_display_(/*16.5*/if(searchResults != null)/*16.30*/ {_display_(Seq[Any](format.raw/*16.32*/("""
				"""),_display_(/*17.6*/for((searchTerms, searchResultlist) <- searchResults) yield /*17.59*/{_display_(Seq[Any](format.raw/*17.60*/("""
					"""),format.raw/*18.6*/("""<p>Search terms : """),_display_(/*18.25*/searchTerms),format.raw/*18.36*/(""" """),format.raw/*18.37*/(""": Flesh reading Ease Index ## FKGL #.#</p>
					"""),_display_(/*19.7*/if(searchResultlist.getResult().size()>0)/*19.48*/{_display_(Seq[Any](format.raw/*19.49*/("""
						"""),format.raw/*20.7*/("""<a href=""""),_display_(/*20.17*/routes/*20.23*/.HomeController.wordStat(searchTerms)),format.raw/*20.60*/("""">Global Stats</a>
						<table>
							<tr>
								<th>Owner_id</th>
								<th>Date</th>
								<th>Title</th>
								<th>Type</th>
								<th>Skills</th>
							</tr>
							"""),_display_(/*29.9*/for(result <- searchResultlist.getResult()) yield /*29.52*/{_display_(Seq[Any](format.raw/*29.53*/("""
								"""),format.raw/*30.9*/("""<tr>
									<td><a href='"""),_display_(/*31.24*/routes/*31.30*/.HomeController.profile(result.getOwner_id())),format.raw/*31.75*/("""'>"""),_display_(/*31.78*/result/*31.84*/.getOwner_id()),format.raw/*31.98*/("""</a></td>
									<td>"""),_display_(/*32.15*/result/*32.21*/.getDate()),format.raw/*32.31*/("""</td>
									<td>"""),_display_(/*33.15*/result/*33.21*/.getTitle()),format.raw/*33.32*/("""</td>
									<td>"""),_display_(/*34.15*/result/*34.21*/.getType()),format.raw/*34.31*/("""</td>
									<td>"""),_display_(/*35.15*/for((key,value) <- result.getSkills()) yield /*35.53*/{_display_(Seq[Any](format.raw/*35.54*/("""
										"""),format.raw/*36.11*/("""<u><a href=""""),_display_(/*36.24*/routes/*36.30*/.HomeController.skill(value,key)),format.raw/*36.62*/("""" target="_blank">"""),_display_(/*36.81*/key),format.raw/*36.84*/("""</a></u>
									""")))}),format.raw/*37.11*/("""
									"""),format.raw/*38.10*/("""</td>
									<td><a href=""""),_display_(/*39.24*/routes/*39.30*/.HomeController.indvStat(searchTerms, result.getIndex())),format.raw/*39.86*/("""">Stats</a></td>
									<td><a href=#>Readability</a></td>
								</tr>
							""")))}),format.raw/*42.9*/("""
						"""),format.raw/*43.7*/("""</table>
					""")))}/*44.7*/else/*44.11*/{_display_(Seq[Any](format.raw/*44.12*/("""
						"""),format.raw/*45.7*/("""<p>There are no project for the term : """),_display_(/*45.47*/searchTerms),format.raw/*45.58*/("""</p>
					""")))}),format.raw/*46.7*/("""
				""")))}),format.raw/*47.6*/("""
			""")))}),format.raw/*48.5*/("""
			"""),format.raw/*49.4*/("""</div>
		</article>
	</center>
	<script>
	const characters ='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';

	function generateString() """),format.raw/*55.28*/("""{"""),format.raw/*55.29*/("""
		"""),format.raw/*56.3*/("""console.log("In the function");
		let result = ' ';
		const charactersLength = characters.length;
		for ( let i = 0; i < 8; i++ ) """),format.raw/*59.33*/("""{"""),format.raw/*59.34*/("""
			"""),format.raw/*60.4*/("""result += characters.charAt(Math.floor(Math.random() * charactersLength));
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""
		"""),format.raw/*62.3*/("""return result;
	"""),format.raw/*63.2*/("""}"""),format.raw/*63.3*/(""";

	window.onload=function()"""),format.raw/*65.26*/("""{"""),format.raw/*65.27*/("""
		"""),format.raw/*66.3*/("""var mb = document.getElementById("submitbtn");
		mb.addEventListener("click", checkCookie);
		console.log("In the window after loading");
	"""),format.raw/*69.2*/("""}"""),format.raw/*69.3*/(""";

	function setCookie(id)"""),format.raw/*71.24*/("""{"""),format.raw/*71.25*/("""
		"""),format.raw/*72.3*/("""console.log("setcokkie id "+id);
		const date = new Date();
		date.setTime(date.getTime() + (365 * 24 * 60 * 60 * 1000));
		var expires = "expires="+date.toUTCString();
		document.cookie = "sessionId="+id+";"+expires+";path=/";
	"""),format.raw/*77.2*/("""}"""),format.raw/*77.3*/(""";

	function getCookie()"""),format.raw/*79.22*/("""{"""),format.raw/*79.23*/("""
		"""),format.raw/*80.3*/("""let name = "sessionId=";
		let spli = document.cookie.split(';');
		for(var j=0;j < spli.length; j++)"""),format.raw/*82.36*/("""{"""),format.raw/*82.37*/("""
			"""),format.raw/*83.4*/("""let char = spli[j];
			while(char.charAt(0) == ' ') """),format.raw/*84.33*/("""{"""),format.raw/*84.34*/("""
				"""),format.raw/*85.5*/("""char = char.substring(1);
			"""),format.raw/*86.4*/("""}"""),format.raw/*86.5*/("""
			"""),format.raw/*87.4*/("""if(char.indexOf(name) == 0) """),format.raw/*87.32*/("""{"""),format.raw/*87.33*/("""
				"""),format.raw/*88.5*/("""return char.substring(name.length, char.length);
			"""),format.raw/*89.4*/("""}"""),format.raw/*89.5*/("""
		"""),format.raw/*90.3*/("""}"""),format.raw/*90.4*/("""
		"""),format.raw/*91.3*/("""id = "";
		console.log("getcookie id "+id);
		return id;
	"""),format.raw/*94.2*/("""}"""),format.raw/*94.3*/(""";

	function checkCookie() """),format.raw/*96.25*/("""{"""),format.raw/*96.26*/("""
		"""),format.raw/*97.3*/("""var id = getCookie();
		console.log("id "+id);
		if(id != "")"""),format.raw/*99.15*/("""{"""),format.raw/*99.16*/("""
			"""),format.raw/*100.4*/("""console.log("checkcookie id if not null"+id);
			//alert(id);
			document.getElementById("hiddenId").value = id
		"""),format.raw/*103.3*/("""}"""),format.raw/*103.4*/("""
		"""),format.raw/*104.3*/("""else"""),format.raw/*104.7*/("""{"""),format.raw/*104.8*/("""
			"""),format.raw/*105.4*/("""id = generateString();
			console.log("checkcookie id "+id);
			if(id != "" && id != null)"""),format.raw/*107.30*/("""{"""),format.raw/*107.31*/("""
				"""),format.raw/*108.5*/("""setCookie(id);
			"""),format.raw/*109.4*/("""}"""),format.raw/*109.5*/("""
		"""),format.raw/*110.3*/("""}"""),format.raw/*110.4*/("""
	"""),format.raw/*111.2*/("""}"""),format.raw/*111.3*/(""";
	</script>
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
                  HASH: 6bdd795ce1983046179343389e144c15f88ccb63
                  MATRIX: 610->1|649->35|994->61|1129->101|1159->106|1187->126|1226->128|1255->131|1641->491|1675->516|1715->518|1748->525|1817->578|1856->579|1890->586|1936->605|1968->616|1997->617|2073->667|2123->708|2162->709|2197->717|2234->727|2249->733|2307->770|2525->962|2584->1005|2623->1006|2660->1016|2716->1045|2731->1051|2797->1096|2827->1099|2842->1105|2877->1119|2929->1144|2944->1150|2975->1160|3023->1181|3038->1187|3070->1198|3118->1219|3133->1225|3164->1235|3212->1256|3266->1294|3305->1295|3345->1307|3385->1320|3400->1326|3453->1358|3499->1377|3523->1380|3574->1400|3613->1411|3670->1441|3685->1447|3762->1503|3878->1589|3913->1597|3947->1613|3960->1617|3999->1618|4034->1626|4101->1666|4133->1677|4175->1689|4212->1696|4248->1702|4280->1707|4468->1867|4497->1868|4528->1872|4689->2005|4718->2006|4750->2011|4855->2089|4883->2090|4914->2094|4958->2111|4986->2112|5044->2142|5073->2143|5104->2147|5273->2289|5301->2290|5357->2318|5386->2319|5417->2323|5678->2557|5706->2558|5760->2584|5789->2585|5820->2589|5951->2692|5980->2693|6012->2698|6093->2751|6122->2752|6155->2758|6212->2788|6240->2789|6272->2794|6328->2822|6357->2823|6390->2829|6470->2882|6498->2883|6529->2887|6557->2888|6588->2892|6676->2953|6704->2954|6761->2983|6790->2984|6821->2988|6912->3051|6941->3052|6974->3057|7119->3174|7148->3175|7180->3179|7212->3183|7241->3184|7274->3189|7395->3281|7425->3282|7459->3288|7506->3307|7535->3308|7567->3312|7596->3313|7627->3316|7656->3317
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|51->20|60->29|60->29|60->29|61->30|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|67->36|67->36|67->36|68->37|69->38|70->39|70->39|70->39|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|78->47|79->48|80->49|86->55|86->55|87->56|90->59|90->59|91->60|92->61|92->61|93->62|94->63|94->63|96->65|96->65|97->66|100->69|100->69|102->71|102->71|103->72|108->77|108->77|110->79|110->79|111->80|113->82|113->82|114->83|115->84|115->84|116->85|117->86|117->86|118->87|118->87|118->87|119->88|120->89|120->89|121->90|121->90|122->91|125->94|125->94|127->96|127->96|128->97|130->99|130->99|131->100|134->103|134->103|135->104|135->104|135->104|136->105|138->107|138->107|139->108|140->109|140->109|141->110|141->110|142->111|142->111
                  -- GENERATED --
              */
          