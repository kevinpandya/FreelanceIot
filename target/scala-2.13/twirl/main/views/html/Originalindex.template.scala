
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

object Originalindex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

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
            <input id="submitbtn" type="submit" value="Go!" />
            <br />
            <input type="text" id="hiddenId" name="sessionId" value="" />
        </form>
        <div>
            """),_display_(/*16.14*/if(searchResults != null)/*16.39*/ {_display_(Seq[Any](format.raw/*16.41*/("""
            """),_display_(/*17.14*/for((searchTerms, searchResultlist) <- searchResults) yield /*17.67*/{_display_(Seq[Any](format.raw/*17.68*/("""

            """),_display_(/*19.14*/if(searchResultlist.getResult().size()>0)/*19.55*/{_display_(Seq[Any](format.raw/*19.56*/("""
            """),format.raw/*20.13*/("""<p>Search terms : """),_display_(/*20.32*/searchTerms),format.raw/*20.43*/(""" """),format.raw/*20.44*/(""": Flesh reading Ease Index: """),_display_(/*20.73*/searchResultlist/*20.89*/.getFleschIndex()),format.raw/*20.106*/("""  """),format.raw/*20.108*/("""FKGL : """),_display_(/*20.116*/searchResultlist/*20.132*/.getFkgl()),format.raw/*20.142*/("""</p>
            <a href=""""),_display_(/*21.23*/routes/*21.29*/.HomeController.wordStat(searchTerms)),format.raw/*21.66*/("""">Global Stats</a>
            <table>
                <tr>
                    <th>Owner_id</th>
                    <th>Date</th>
                    <th>Title</th>
                    <th>Type</th>
                    <th>Skills</th>
                    <th></th>
                    <th></th>
                    <th>Education Level</th>
                </tr>
                """),_display_(/*33.18*/for(result <- searchResultlist.getResult()) yield /*33.61*/{_display_(Seq[Any](format.raw/*33.62*/("""
                """),format.raw/*34.17*/("""<tr>
                    <td><a href='"""),_display_(/*35.35*/routes/*35.41*/.HomeController.profile(result.getOwner_id())),format.raw/*35.86*/("""'>"""),_display_(/*35.89*/result/*35.95*/.getOwner_id()),format.raw/*35.109*/("""</a></td>
                    <td>"""),_display_(/*36.26*/result/*36.32*/.getDate()),format.raw/*36.42*/("""</td>
                    <td>"""),_display_(/*37.26*/result/*37.32*/.getTitle()),format.raw/*37.43*/("""</td>
                    <td>"""),_display_(/*38.26*/result/*38.32*/.getType()),format.raw/*38.42*/("""</td>
                    <td>"""),_display_(/*39.26*/for((key,value) <- result.getSkills()) yield /*39.64*/{_display_(Seq[Any](format.raw/*39.65*/("""
                        """),format.raw/*40.25*/("""<u><a href=""""),_display_(/*40.38*/routes/*40.44*/.HomeController.skill(value)),format.raw/*40.72*/("""" target="_blank">"""),_display_(/*40.91*/key),format.raw/*40.94*/("""</a></u>
                        """)))}),format.raw/*41.26*/("""
                    """),format.raw/*42.21*/("""</td>
                    <td><a href=""""),_display_(/*43.35*/routes/*43.41*/.HomeController.indvStat(searchTerms, result.getIndex())),format.raw/*43.97*/("""">Stats</a></td>
                    <td><a href=""""),_display_(/*44.35*/routes/*44.41*/.HomeController.readability(searchTerms, result.getIndex())),format.raw/*44.100*/("""">Readability</a></td>
                    <td>"""),_display_(/*45.26*/searchResultlist/*45.42*/.getEdLevel()),format.raw/*45.55*/("""</td>
                </tr>
                """)))}),format.raw/*47.18*/("""
            """),format.raw/*48.13*/("""</table>
            """)))}/*49.14*/else/*49.18*/{_display_(Seq[Any](format.raw/*49.19*/("""
            """),format.raw/*50.13*/("""<p>Search terms : """),_display_(/*50.32*/searchTerms),format.raw/*50.43*/(""" """),format.raw/*50.44*/(""": Flesh reading Ease Index: ## FKGL: ##.##</p>
            <p>There are no project for the term : """),_display_(/*51.53*/searchTerms),format.raw/*51.64*/("""</p>
            """)))}),format.raw/*52.14*/("""
            """)))}),format.raw/*53.14*/("""
            """)))}),format.raw/*54.14*/("""
        """),format.raw/*55.9*/("""</div>
    </article>
</center>
<script>
				const characters ='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';

				function generateString() """),format.raw/*61.31*/("""{"""),format.raw/*61.32*/("""
					"""),format.raw/*62.6*/("""console.log("In the function");
					let result = ' ';
					const charactersLength = characters.length;
					for ( let i = 0; i < 8; i++ ) """),format.raw/*65.36*/("""{"""),format.raw/*65.37*/("""
						"""),format.raw/*66.7*/("""result += characters.charAt(Math.floor(Math.random() * charactersLength));
					"""),format.raw/*67.6*/("""}"""),format.raw/*67.7*/("""
					"""),format.raw/*68.6*/("""return result;
				"""),format.raw/*69.5*/("""}"""),format.raw/*69.6*/(""";

				window.onload=function()"""),format.raw/*71.29*/("""{"""),format.raw/*71.30*/("""
					"""),format.raw/*72.6*/("""var mb = document.getElementById("submitbtn");
					mb.addEventListener("click", checkCookie);
					console.log("In the window after loading");
				"""),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""";

				function setCookie(id)"""),format.raw/*77.27*/("""{"""),format.raw/*77.28*/("""
					"""),format.raw/*78.6*/("""console.log("setcokkie id "+id);
					const date = new Date();
					date.setTime(date.getTime() + (365 * 24 * 60 * 60 * 1000));
					var expires = "expires="+date.toUTCString();
					document.cookie = "sessionId="+id+";"+expires+";path=/";
				"""),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""";

				function getCookie()"""),format.raw/*85.25*/("""{"""),format.raw/*85.26*/("""
					"""),format.raw/*86.6*/("""let name = "sessionId=";
					let spli = document.cookie.split(';');
					for(var j=0;j < spli.length; j++)"""),format.raw/*88.39*/("""{"""),format.raw/*88.40*/("""
						"""),format.raw/*89.7*/("""let char = spli[j];
						while(char.charAt(0) == ' ') """),format.raw/*90.36*/("""{"""),format.raw/*90.37*/("""
							"""),format.raw/*91.8*/("""char = char.substring(1);
						"""),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""
						"""),format.raw/*93.7*/("""if(char.indexOf(name) == 0) """),format.raw/*93.35*/("""{"""),format.raw/*93.36*/("""
							"""),format.raw/*94.8*/("""return char.substring(name.length, char.length);
						"""),format.raw/*95.7*/("""}"""),format.raw/*95.8*/("""
					"""),format.raw/*96.6*/("""}"""),format.raw/*96.7*/("""
					"""),format.raw/*97.6*/("""id = "";
					console.log("getcookie id "+id);
					return id;
				"""),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""";

				function checkCookie() """),format.raw/*102.28*/("""{"""),format.raw/*102.29*/("""
					"""),format.raw/*103.6*/("""var id = getCookie();
					console.log("id "+id);
					if(id != "")"""),format.raw/*105.18*/("""{"""),format.raw/*105.19*/("""
						"""),format.raw/*106.7*/("""console.log("checkcookie id if not null"+id);
						//alert(id);
						document.getElementById("hiddenId").value = id
					"""),format.raw/*109.6*/("""}"""),format.raw/*109.7*/("""
					"""),format.raw/*110.6*/("""else"""),format.raw/*110.10*/("""{"""),format.raw/*110.11*/("""
						"""),format.raw/*111.7*/("""id = generateString();
						console.log("checkcookie id "+id);
						if(id != "" && id != null)"""),format.raw/*113.33*/("""{"""),format.raw/*113.34*/("""
							"""),format.raw/*114.8*/("""setCookie(id);
						"""),format.raw/*115.7*/("""}"""),format.raw/*115.8*/("""
					"""),format.raw/*116.6*/("""}"""),format.raw/*116.7*/("""
				"""),format.raw/*117.5*/("""}"""),format.raw/*117.6*/(""";
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
                  SOURCE: app/views/Originalindex.scala.html
                  HASH: bd6cdcbfff2c43c7d783b23d219ace91b4cc0c88
                  MATRIX: 610->1|649->35|1002->61|1137->101|1167->106|1195->126|1234->128|1262->130|1712->553|1746->578|1786->580|1828->595|1897->648|1936->649|1980->666|2030->707|2069->708|2111->722|2157->741|2189->752|2218->753|2274->782|2299->798|2338->815|2369->817|2405->825|2431->841|2463->851|2518->879|2533->885|2591->922|3011->1315|3070->1358|3109->1359|3155->1377|3222->1417|3237->1423|3303->1468|3333->1471|3348->1477|3384->1491|3447->1527|3462->1533|3493->1543|3552->1575|3567->1581|3599->1592|3658->1624|3673->1630|3704->1640|3763->1672|3817->1710|3856->1711|3910->1737|3950->1750|3965->1756|4014->1784|4060->1803|4084->1806|4150->1841|4200->1863|4268->1904|4283->1910|4360->1966|4439->2018|4454->2024|4535->2083|4611->2132|4636->2148|4670->2161|4748->2208|4790->2222|4832->2245|4845->2249|4884->2250|4926->2264|4972->2283|5004->2294|5033->2295|5160->2395|5192->2406|5242->2425|5288->2440|5334->2455|5371->2465|5565->2631|5594->2632|5628->2639|5798->2781|5827->2782|5862->2790|5970->2871|5998->2872|6032->2879|6079->2899|6107->2900|6168->2933|6197->2934|6231->2941|6409->3092|6437->3093|6496->3124|6525->3125|6559->3132|6835->3381|6863->3382|6920->3411|6949->3412|6983->3419|7120->3528|7149->3529|7184->3537|7268->3593|7297->3594|7333->3603|7393->3636|7421->3637|7456->3645|7512->3673|7541->3674|7577->3683|7660->3739|7688->3740|7722->3747|7750->3748|7784->3755|7882->3825|7911->3826|7972->3858|8002->3859|8037->3866|8135->3935|8165->3936|8201->3944|8355->4070|8384->4071|8419->4078|8452->4082|8482->4083|8518->4091|8645->4189|8675->4190|8712->4199|8762->4221|8791->4222|8826->4229|8855->4230|8889->4236|8918->4237
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|64->33|64->33|64->33|65->34|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|78->47|79->48|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|82->51|83->52|84->53|85->54|86->55|92->61|92->61|93->62|96->65|96->65|97->66|98->67|98->67|99->68|100->69|100->69|102->71|102->71|103->72|106->75|106->75|108->77|108->77|109->78|114->83|114->83|116->85|116->85|117->86|119->88|119->88|120->89|121->90|121->90|122->91|123->92|123->92|124->93|124->93|124->93|125->94|126->95|126->95|127->96|127->96|128->97|131->100|131->100|133->102|133->102|134->103|136->105|136->105|137->106|140->109|140->109|141->110|141->110|141->110|142->111|144->113|144->113|145->114|146->115|146->115|147->116|147->116|148->117|148->117
                  -- GENERATED --
              */
          