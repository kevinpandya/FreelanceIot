
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
/*1.2*/import model.Profile
/*2.2*/import model.projectInfo

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Profile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchProfile: Map[String, Profile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.39*/("""

"""),_display_(/*5.2*/main("FreeLancelot")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""<center>
    <article style="margin-top:50px;">
        <div>
            """),_display_(/*9.14*/if(searchProfile != null)/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
                """),_display_(/*10.18*/for((searchTerms, user) <- searchProfile) yield /*10.59*/{_display_(Seq[Any](format.raw/*10.60*/("""
                    """),format.raw/*11.21*/("""<h2>Owner Details</h2>
                    <b>Publicname : """),_display_(/*12.38*/searchTerms),format.raw/*12.49*/("""</b>
                    <style>
                        table """),format.raw/*14.31*/("""{"""),format.raw/*14.32*/("""
                            """),format.raw/*15.29*/("""border-collapse: collapse;
                        """),format.raw/*16.25*/("""}"""),format.raw/*16.26*/("""
                        """),format.raw/*17.25*/("""th """),format.raw/*17.28*/("""{"""),format.raw/*17.29*/("""
                            """),format.raw/*18.29*/("""background-color:lightskyblue;
                            Color:white;
                        """),format.raw/*20.25*/("""}"""),format.raw/*20.26*/("""
                        """),format.raw/*21.25*/("""th, td """),format.raw/*21.32*/("""{"""),format.raw/*21.33*/("""
                            """),format.raw/*22.29*/("""text-align:center;
                            border:1px solid black;
                            padding:5px

                        """),format.raw/*26.25*/("""}"""),format.raw/*26.26*/("""
                    """),format.raw/*27.21*/("""</style>
                    <table border="1px" >
                        """),_display_(/*29.26*/if(user.getId() != null)/*29.50*/ {_display_(Seq[Any](format.raw/*29.52*/("""
                            """),format.raw/*30.29*/("""<tr>
                            <th>Owner_id</th>
                            <td>"""),_display_(/*32.34*/user/*32.38*/.getId()),format.raw/*32.46*/("""</td>
                            </tr>
                        """)))}),format.raw/*34.26*/("""
                        """),_display_(/*35.26*/if(user.getUsername() != null)/*35.56*/{_display_(Seq[Any](format.raw/*35.57*/("""
                            """),format.raw/*36.29*/("""<tr>
                            <th>Username</th>
                            <td>"""),_display_(/*38.34*/user/*38.38*/.getUsername()),format.raw/*38.52*/("""</td>
                            </tr>
                        """)))}),format.raw/*40.26*/("""

                        """),_display_(/*42.26*/if(user.getCountry() != null)/*42.55*/{_display_(Seq[Any](format.raw/*42.56*/("""
                            """),format.raw/*43.29*/("""<tr>
                            <th>Country</th>
                            <td>"""),_display_(/*45.34*/user/*45.38*/.getCountry()),format.raw/*45.51*/("""</td>
                            </tr>
                        """)))}),format.raw/*47.26*/("""
                        """),_display_(/*48.26*/if(user.getCity() != null)/*48.52*/{_display_(Seq[Any](format.raw/*48.53*/("""
                            """),format.raw/*49.29*/("""<tr>
                            <th>City</th>
                            <td>"""),_display_(/*51.34*/user/*51.38*/.getCity()),format.raw/*51.48*/("""</td>
                            </tr>
                        """)))}),format.raw/*53.26*/("""
                        """),_display_(/*54.26*/if(user.getRole() != null)/*54.52*/{_display_(Seq[Any](format.raw/*54.53*/("""
                            """),format.raw/*55.29*/("""<tr>
                            <th>role</th>
                            <td>"""),_display_(/*57.34*/user/*57.38*/.getRole()),format.raw/*57.48*/("""</td>
                            </tr>
                        """)))}),format.raw/*59.26*/("""
                        """),_display_(/*60.26*/if(user.getChosenrole() != null)/*60.58*/{_display_(Seq[Any](format.raw/*60.59*/("""
                        """),format.raw/*61.25*/("""<tr>
                            <th>Chosen_role</th>
                            <td>"""),_display_(/*63.34*/user/*63.38*/.getChosenrole()),format.raw/*63.54*/("""</td>
                        </tr>
                        """)))}),format.raw/*65.26*/("""
                        """),_display_(/*66.26*/if(user.getProfiledescription() != null)/*66.66*/{_display_(Seq[Any](format.raw/*66.67*/("""
                            """),format.raw/*67.29*/("""<tr>
                            <th>Profiledescription</th>
                            <td>"""),_display_(/*69.34*/user/*69.38*/.getProfiledescription()),format.raw/*69.62*/("""</td>
                            </tr>
                        """)))}),format.raw/*71.26*/("""
                        """),_display_(/*72.26*/if(user.getRecommendations() != null)/*72.63*/{_display_(Seq[Any](format.raw/*72.64*/("""
                            """),format.raw/*73.29*/("""<tr>
                            <th>Recommendations</th>
                            <td>"""),_display_(/*75.34*/user/*75.38*/.getRecommendations()),format.raw/*75.59*/("""</td>
                            </tr>
                        """)))}),format.raw/*77.26*/("""
                        """),_display_(/*78.26*/if(user.getRegistrationdate() != null)/*78.64*/{_display_(Seq[Any](format.raw/*78.65*/("""
                        """),format.raw/*79.25*/("""<tr>
                            <th>RegstationDate</th>
                            <td>"""),_display_(/*81.34*/user/*81.38*/.getRegistrationdate()),format.raw/*81.60*/("""</td>
                        </tr>
                        """)))}),format.raw/*83.26*/("""
                        """),_display_(/*84.26*/if(user.getCompany() != null)/*84.55*/{_display_(Seq[Any](format.raw/*84.56*/("""
                            """),format.raw/*85.29*/("""<tr>
                            <th>Company</th>
                            <td>"""),_display_(/*87.34*/user/*87.38*/.getCompany()),format.raw/*87.51*/("""</td>
                            </tr>
                        """)))}),format.raw/*89.26*/("""
                        """),_display_(/*90.26*/if(user.getHourylyrate() != null)/*90.59*/{_display_(Seq[Any](format.raw/*90.60*/("""
                            """),format.raw/*91.29*/("""<tr>
                            <th>HourylyRate</th>
                            <td>"""),_display_(/*93.34*/user/*93.38*/.getHourylyrate()),format.raw/*93.55*/("""</td>
                            </tr>
                        """)))}),format.raw/*95.26*/("""
                        """),_display_(/*96.26*/if(user.getPrimarylanguage() != null)/*96.63*/{_display_(Seq[Any](format.raw/*96.64*/("""
                        """),format.raw/*97.25*/("""<tr>
                            <th>Primarylanguage</th>
                            <td>"""),_display_(/*99.34*/user/*99.38*/.getPrimarylanguage()),format.raw/*99.59*/("""</td>
                        </tr>
                        """)))}),format.raw/*101.26*/("""
                        """),_display_(/*102.26*/if(user.getLimitedaccount() != null)/*102.62*/{_display_(Seq[Any](format.raw/*102.63*/("""
                        """),format.raw/*103.25*/("""<tr>
                            <th>Limitedaccount</th>
                            <td>"""),_display_(/*105.34*/user/*105.38*/.getLimitedaccount()),format.raw/*105.58*/("""</td>
                        </tr>
                        """)))}),format.raw/*107.26*/("""
                        """),_display_(/*108.26*/if(user.getCode() != null)/*108.52*/{_display_(Seq[Any](format.raw/*108.53*/("""
                        """),format.raw/*109.25*/("""<tr>
                            <th>CountryCode</th>
                            <td>"""),_display_(/*111.34*/user/*111.38*/.getCode()),format.raw/*111.48*/("""</td>
                        </tr>
                        """)))}),format.raw/*113.26*/("""
                        """),_display_(/*114.26*/if(user.getSign() != null)/*114.52*/{_display_(Seq[Any](format.raw/*114.53*/("""
                        """),format.raw/*115.25*/("""<tr>
                            <th>CountrySign</th>
                            <td>"""),_display_(/*117.34*/user/*117.38*/.getSign()),format.raw/*117.48*/("""</td>
                        </tr>
                        """)))}),format.raw/*119.26*/("""
                        """),_display_(/*120.26*/if(user.getCurrencyname() != null)/*120.60*/{_display_(Seq[Any](format.raw/*120.61*/("""
                        """),format.raw/*121.25*/("""<tr>
                            <th>CurrencyName</th>
                            <td>"""),_display_(/*123.34*/user/*123.38*/.getCurrencyname()),format.raw/*123.56*/("""</td>
                        </tr>
                        """)))}),format.raw/*125.26*/("""
                        """),_display_(/*126.26*/if(user.getPublicname() != null)/*126.58*/{_display_(Seq[Any](format.raw/*126.59*/("""
                            """),format.raw/*127.29*/("""<tr>
                            <th>Publicname</th>
                            <td>"""),_display_(/*129.34*/user/*129.38*/.getPublicname()),format.raw/*129.54*/("""</td>
                            </tr>
                        """)))}),format.raw/*131.26*/("""
                        """),_display_(/*132.26*/if(user.getEmailverified() != null)/*132.61*/{_display_(Seq[Any](format.raw/*132.62*/("""
                        """),format.raw/*133.25*/("""<tr>
                            <th>Email_Verified</th>
                            <td>"""),_display_(/*135.34*/user/*135.38*/.getEmailverified()),format.raw/*135.57*/("""</td>
                        </tr>
                        """)))}),format.raw/*137.26*/("""
                        """),_display_(/*138.26*/if(user.getTimezone() != null)/*138.56*/{_display_(Seq[Any](format.raw/*138.57*/("""
                        """),format.raw/*139.25*/("""<tr>
                            <th>TimeZone</th>
                            <td>"""),_display_(/*141.34*/user/*141.38*/.getTimezone()),format.raw/*141.52*/("""</td>
                        </tr>
                        """)))}),format.raw/*143.26*/("""
                        """),_display_(/*144.26*/if(user.getSkills().size()>0)/*144.55*/{_display_(Seq[Any](format.raw/*144.56*/("""
                            """),format.raw/*145.29*/("""<tr>
                            <th>Skills</th>
                            <td>"""),_display_(/*147.34*/for((key,value) <- user.getSkills()) yield /*147.70*/{_display_(Seq[Any](format.raw/*147.71*/("""
                                """),_display_(/*148.34*/key),format.raw/*148.37*/("""
                                """)))}),format.raw/*149.34*/("""
                            """),format.raw/*150.29*/("""</td>
                            </tr>
                        """)))}/*152.26*/else/*152.30*/{_display_(Seq[Any](format.raw/*152.31*/("""
                            """),format.raw/*153.29*/("""<tr>
                            <th>Skills</th>
                             <td>Users does not have any skills</td>
                            </tr>
                        """)))}),format.raw/*157.26*/("""
                        """),_display_(/*158.26*/if( user.getQualifications().size()>0)/*158.64*/{_display_(Seq[Any](format.raw/*158.65*/("""
                            """),format.raw/*159.29*/("""<tr>
                            <th>Qualifications</th>
                            <td>"""),_display_(/*161.34*/for((key,value) <- user.getQualifications()) yield /*161.78*/{_display_(Seq[Any](format.raw/*161.79*/("""
                                """),_display_(/*162.34*/key),format.raw/*162.37*/("""
                                """)))}),format.raw/*163.34*/("""
                            """),format.raw/*164.29*/("""</td>
                            </tr>
                        """)))}/*166.26*/else/*166.30*/{_display_(Seq[Any](format.raw/*166.31*/("""
                        """),format.raw/*167.25*/("""<tr>
                            <th>Qualifications</th>
                            <td>Users does not have any Qualifications</td>
                        </tr>
                        """)))}),format.raw/*171.26*/("""
                    """),format.raw/*172.21*/("""</table>
                    <h3>Projects</h3>
                    <table>
                        """),_display_(/*175.26*/if( user.getProjects().size()>0)/*175.58*/{_display_(Seq[Any](format.raw/*175.59*/("""
                            """),format.raw/*176.29*/("""<tr>
                                <th>Title</th>
                                <th>Description</th>
                                <th>Last Modified Date</th>
                                <th>Protfolio Id</th>
                            </tr>
                            """),_display_(/*182.30*/for(projects <- user.getProjects()) yield /*182.65*/{_display_(Seq[Any](format.raw/*182.66*/("""
                            """),format.raw/*183.29*/("""<tr>
                                <td>"""),_display_(/*184.38*/projects/*184.46*/.getTitle()),format.raw/*184.57*/("""</td>
                                <td>"""),_display_(/*185.38*/projects/*185.46*/.getDescription()),format.raw/*185.63*/("""</td>
                                <td>"""),_display_(/*186.38*/projects/*186.46*/.getLastmodifydate()),format.raw/*186.66*/("""</td>
                                <td>"""),_display_(/*187.38*/projects/*187.46*/.getPortfolioid()),format.raw/*187.63*/("""</td>
                            </tr>
                            """)))}),format.raw/*189.30*/("""
                        """)))}/*190.26*/else/*190.30*/{_display_(Seq[Any](format.raw/*190.31*/("""
                            """),format.raw/*191.29*/("""<p>This user does not have project</p>
                        """)))}),format.raw/*192.26*/("""
                    """),format.raw/*193.21*/("""</table>
                """)))}),format.raw/*194.18*/("""
            """)))}),format.raw/*195.14*/("""
        """),format.raw/*196.9*/("""</div>
    </article>
</center>
""")))}))
      }
    }
  }

  def render(searchProfile:Map[String, Profile]): play.twirl.api.HtmlFormat.Appendable = apply(searchProfile)

  def f:((Map[String, Profile]) => play.twirl.api.HtmlFormat.Appendable) = (searchProfile) => apply(searchProfile)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/profile.scala.html
                  HASH: 0330808bf36dfa0cf5dbc7e36c2023b51f669605
                  MATRIX: 610->1|638->24|983->51|1115->88|1145->93|1173->113|1212->115|1240->117|1344->195|1377->220|1416->222|1462->241|1519->282|1558->283|1608->305|1696->366|1728->377|1821->442|1850->443|1908->473|1988->525|2017->526|2071->552|2102->555|2131->556|2189->586|2315->684|2344->685|2398->711|2433->718|2462->719|2520->749|2688->889|2717->890|2767->912|2872->990|2905->1014|2945->1016|3003->1046|3116->1132|3129->1136|3158->1144|3256->1211|3310->1238|3349->1268|3388->1269|3446->1299|3559->1385|3572->1389|3607->1403|3705->1470|3761->1499|3799->1528|3838->1529|3896->1559|4008->1644|4021->1648|4055->1661|4153->1728|4207->1755|4242->1781|4281->1782|4339->1812|4448->1894|4461->1898|4492->1908|4590->1975|4644->2002|4679->2028|4718->2029|4776->2059|4885->2141|4898->2145|4929->2155|5027->2222|5081->2249|5122->2281|5161->2282|5215->2308|5331->2397|5344->2401|5381->2417|5475->2480|5529->2507|5578->2547|5617->2548|5675->2578|5798->2674|5811->2678|5856->2702|5954->2769|6008->2796|6054->2833|6093->2834|6151->2864|6271->2957|6284->2961|6326->2982|6424->3049|6478->3076|6525->3114|6564->3115|6618->3141|6737->3233|6750->3237|6793->3259|6887->3322|6941->3349|6979->3378|7018->3379|7076->3409|7188->3494|7201->3498|7235->3511|7333->3578|7387->3605|7429->3638|7468->3639|7526->3669|7642->3758|7655->3762|7693->3779|7791->3846|7845->3873|7891->3910|7930->3911|7984->3937|8104->4030|8117->4034|8159->4055|8254->4118|8309->4145|8355->4181|8395->4182|8450->4208|8570->4300|8584->4304|8626->4324|8721->4387|8776->4414|8812->4440|8852->4441|8907->4467|9024->4556|9038->4560|9070->4570|9165->4633|9220->4660|9256->4686|9296->4687|9351->4713|9468->4802|9482->4806|9514->4816|9609->4879|9664->4906|9708->4940|9748->4941|9803->4967|9921->5057|9935->5061|9975->5079|10070->5142|10125->5169|10167->5201|10207->5202|10266->5232|10382->5320|10396->5324|10434->5340|10533->5407|10588->5434|10633->5469|10673->5470|10728->5496|10848->5588|10862->5592|10903->5611|10998->5674|11053->5701|11093->5731|11133->5732|11188->5758|11302->5844|11316->5848|11352->5862|11447->5925|11502->5952|11541->5981|11581->5982|11640->6012|11752->6096|11805->6132|11845->6133|11908->6168|11933->6171|12000->6206|12059->6236|12146->6303|12160->6307|12200->6308|12259->6338|12472->6519|12527->6546|12575->6584|12615->6585|12674->6615|12794->6707|12855->6751|12895->6752|12958->6787|12983->6790|13050->6825|13109->6855|13196->6922|13210->6926|13250->6927|13305->6953|13529->7145|13580->7167|13711->7270|13753->7302|13793->7303|13852->7333|14168->7621|14220->7656|14260->7657|14319->7687|14390->7730|14408->7738|14441->7749|14513->7793|14531->7801|14570->7818|14642->7862|14660->7870|14702->7890|14774->7934|14792->7942|14831->7959|14934->8030|14981->8057|14995->8061|15035->8062|15094->8092|15191->8157|15242->8179|15301->8206|15348->8221|15386->8231
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|43->12|45->14|45->14|46->15|47->16|47->16|48->17|48->17|48->17|49->18|51->20|51->20|52->21|52->21|52->21|53->22|57->26|57->26|58->27|60->29|60->29|60->29|61->30|63->32|63->32|63->32|65->34|66->35|66->35|66->35|67->36|69->38|69->38|69->38|71->40|73->42|73->42|73->42|74->43|76->45|76->45|76->45|78->47|79->48|79->48|79->48|80->49|82->51|82->51|82->51|84->53|85->54|85->54|85->54|86->55|88->57|88->57|88->57|90->59|91->60|91->60|91->60|92->61|94->63|94->63|94->63|96->65|97->66|97->66|97->66|98->67|100->69|100->69|100->69|102->71|103->72|103->72|103->72|104->73|106->75|106->75|106->75|108->77|109->78|109->78|109->78|110->79|112->81|112->81|112->81|114->83|115->84|115->84|115->84|116->85|118->87|118->87|118->87|120->89|121->90|121->90|121->90|122->91|124->93|124->93|124->93|126->95|127->96|127->96|127->96|128->97|130->99|130->99|130->99|132->101|133->102|133->102|133->102|134->103|136->105|136->105|136->105|138->107|139->108|139->108|139->108|140->109|142->111|142->111|142->111|144->113|145->114|145->114|145->114|146->115|148->117|148->117|148->117|150->119|151->120|151->120|151->120|152->121|154->123|154->123|154->123|156->125|157->126|157->126|157->126|158->127|160->129|160->129|160->129|162->131|163->132|163->132|163->132|164->133|166->135|166->135|166->135|168->137|169->138|169->138|169->138|170->139|172->141|172->141|172->141|174->143|175->144|175->144|175->144|176->145|178->147|178->147|178->147|179->148|179->148|180->149|181->150|183->152|183->152|183->152|184->153|188->157|189->158|189->158|189->158|190->159|192->161|192->161|192->161|193->162|193->162|194->163|195->164|197->166|197->166|197->166|198->167|202->171|203->172|206->175|206->175|206->175|207->176|213->182|213->182|213->182|214->183|215->184|215->184|215->184|216->185|216->185|216->185|217->186|217->186|217->186|218->187|218->187|218->187|220->189|221->190|221->190|221->190|222->191|223->192|224->193|225->194|226->195|227->196
                  -- GENERATED --
              */
          