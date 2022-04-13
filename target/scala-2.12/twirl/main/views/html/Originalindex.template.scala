
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
                  HASH: f0b6b2fa7fa5941df1c98e8b01949fc9858e3a7d
                  MATRIX: 611->1|650->35|1003->61|1138->101|1168->106|1196->126|1235->128|1263->130|1713->553|1747->578|1787->580|1829->595|1898->648|1937->649|1981->666|2031->707|2070->708|2112->722|2158->741|2190->752|2219->753|2275->782|2300->798|2339->815|2370->817|2406->825|2432->841|2464->851|2519->879|2534->885|2592->922|3012->1315|3071->1358|3110->1359|3156->1377|3223->1417|3238->1423|3304->1468|3334->1471|3349->1477|3385->1491|3448->1527|3463->1533|3494->1543|3553->1575|3568->1581|3600->1592|3659->1624|3674->1630|3705->1640|3764->1672|3818->1710|3857->1711|3911->1737|3951->1750|3966->1756|4015->1784|4061->1803|4085->1806|4151->1841|4201->1863|4269->1904|4284->1910|4361->1966|4440->2018|4455->2024|4536->2083|4612->2132|4637->2148|4671->2161|4749->2208|4791->2222|4833->2245|4846->2249|4885->2250|4927->2264|4973->2283|5005->2294|5034->2295|5161->2395|5193->2406|5243->2425|5289->2440|5335->2455|5372->2465|5566->2631|5595->2632|5629->2639|5799->2781|5828->2782|5863->2790|5971->2871|5999->2872|6033->2879|6080->2899|6108->2900|6169->2933|6198->2934|6232->2941|6410->3092|6438->3093|6497->3124|6526->3125|6560->3132|6836->3381|6864->3382|6921->3411|6950->3412|6984->3419|7121->3528|7150->3529|7185->3537|7269->3593|7298->3594|7334->3603|7394->3636|7422->3637|7457->3645|7513->3673|7542->3674|7578->3683|7661->3739|7689->3740|7723->3747|7751->3748|7785->3755|7883->3825|7912->3826|7973->3858|8003->3859|8038->3866|8136->3935|8166->3936|8202->3944|8356->4070|8385->4071|8420->4078|8453->4082|8483->4083|8519->4091|8646->4189|8676->4190|8713->4199|8763->4221|8792->4222|8827->4229|8856->4230|8890->4236|8919->4237
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|64->33|64->33|64->33|65->34|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|78->47|79->48|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|82->51|83->52|84->53|85->54|86->55|92->61|92->61|93->62|96->65|96->65|97->66|98->67|98->67|99->68|100->69|100->69|102->71|102->71|103->72|106->75|106->75|108->77|108->77|109->78|114->83|114->83|116->85|116->85|117->86|119->88|119->88|120->89|121->90|121->90|122->91|123->92|123->92|124->93|124->93|124->93|125->94|126->95|126->95|127->96|127->96|128->97|131->100|131->100|133->102|133->102|134->103|136->105|136->105|137->106|140->109|140->109|141->110|141->110|141->110|142->111|144->113|144->113|145->114|146->115|146->115|147->116|147->116|148->117|148->117
                  -- GENERATED --
              */
          