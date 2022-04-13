
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
            """),_display_(/*10.14*/for((searchTerms, user) <- searchProfile) yield /*10.55*/{_display_(Seq[Any](format.raw/*10.56*/("""
            """),format.raw/*11.13*/("""<h2>Owner Details</h2>
            <b>Publicname : """),_display_(/*12.30*/searchTerms),format.raw/*12.41*/("""</b>
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
                """),_display_(/*29.18*/if(user.getId() != null)/*29.42*/ {_display_(Seq[Any](format.raw/*29.44*/("""
                """),format.raw/*30.17*/("""<tr>
                    <th>Owner_id</th>
                    <td>"""),_display_(/*32.26*/user/*32.30*/.getId()),format.raw/*32.38*/("""</td>
                </tr>
                """)))}),format.raw/*34.18*/("""
                """),_display_(/*35.18*/if(user.getUsername() != null)/*35.48*/{_display_(Seq[Any](format.raw/*35.49*/("""
                """),format.raw/*36.17*/("""<tr>
                    <th>Username</th>
                    <td>"""),_display_(/*38.26*/user/*38.30*/.getUsername()),format.raw/*38.44*/("""</td>
                </tr>
                """)))}),format.raw/*40.18*/("""

                """),_display_(/*42.18*/if(user.getCountry() != null)/*42.47*/{_display_(Seq[Any](format.raw/*42.48*/("""
                """),format.raw/*43.17*/("""<tr>
                    <th>Country</th>
                    <td>"""),_display_(/*45.26*/user/*45.30*/.getCountry()),format.raw/*45.43*/("""</td>
                </tr>
                """)))}),format.raw/*47.18*/("""
                """),_display_(/*48.18*/if(user.getCity() != null)/*48.44*/{_display_(Seq[Any](format.raw/*48.45*/("""
                """),format.raw/*49.17*/("""<tr>
                    <th>City</th>
                    <td>"""),_display_(/*51.26*/user/*51.30*/.getCity()),format.raw/*51.40*/("""</td>
                </tr>
                """)))}),format.raw/*53.18*/("""
                """),_display_(/*54.18*/if(user.getRole() != null)/*54.44*/{_display_(Seq[Any](format.raw/*54.45*/("""
                """),format.raw/*55.17*/("""<tr>
                    <th>role</th>
                    <td>"""),_display_(/*57.26*/user/*57.30*/.getRole()),format.raw/*57.40*/("""</td>
                </tr>
                """)))}),format.raw/*59.18*/("""
                """),_display_(/*60.18*/if(user.getChosenrole() != null)/*60.50*/{_display_(Seq[Any](format.raw/*60.51*/("""
                """),format.raw/*61.17*/("""<tr>
                    <th>Chosen_role</th>
                    <td>"""),_display_(/*63.26*/user/*63.30*/.getChosenrole()),format.raw/*63.46*/("""</td>
                </tr>
                """)))}),format.raw/*65.18*/("""
                """),_display_(/*66.18*/if(user.getProfiledescription() != null)/*66.58*/{_display_(Seq[Any](format.raw/*66.59*/("""
                """),format.raw/*67.17*/("""<tr>
                    <th>Profiledescription</th>
                    <td>"""),_display_(/*69.26*/user/*69.30*/.getProfiledescription()),format.raw/*69.54*/("""</td>
                </tr>
                """)))}),format.raw/*71.18*/("""
                """),_display_(/*72.18*/if(user.getRecommendations() != null)/*72.55*/{_display_(Seq[Any](format.raw/*72.56*/("""
                """),format.raw/*73.17*/("""<tr>
                    <th>Recommendations</th>
                    <td>"""),_display_(/*75.26*/user/*75.30*/.getRecommendations()),format.raw/*75.51*/("""</td>
                </tr>
                """)))}),format.raw/*77.18*/("""
                """),_display_(/*78.18*/if(user.getRegistrationdate() != null)/*78.56*/{_display_(Seq[Any](format.raw/*78.57*/("""
                """),format.raw/*79.17*/("""<tr>
                    <th>RegstationDate</th>
                    <td>"""),_display_(/*81.26*/user/*81.30*/.getRegistrationdate()),format.raw/*81.52*/("""</td>
                </tr>
                """)))}),format.raw/*83.18*/("""
                """),_display_(/*84.18*/if(user.getCompany() != null)/*84.47*/{_display_(Seq[Any](format.raw/*84.48*/("""
                """),format.raw/*85.17*/("""<tr>
                    <th>Company</th>
                    <td>"""),_display_(/*87.26*/user/*87.30*/.getCompany()),format.raw/*87.43*/("""</td>
                </tr>
                """)))}),format.raw/*89.18*/("""
                """),_display_(/*90.18*/if(user.getHourylyrate() != null)/*90.51*/{_display_(Seq[Any](format.raw/*90.52*/("""
                """),format.raw/*91.17*/("""<tr>
                    <th>HourylyRate</th>
                    <td>"""),_display_(/*93.26*/user/*93.30*/.getHourylyrate()),format.raw/*93.47*/("""</td>
                </tr>
                """)))}),format.raw/*95.18*/("""
                """),_display_(/*96.18*/if(user.getPrimarylanguage() != null)/*96.55*/{_display_(Seq[Any](format.raw/*96.56*/("""
                """),format.raw/*97.17*/("""<tr>
                    <th>Primarylanguage</th>
                    <td>"""),_display_(/*99.26*/user/*99.30*/.getPrimarylanguage()),format.raw/*99.51*/("""</td>
                </tr>
                """)))}),format.raw/*101.18*/("""
                """),_display_(/*102.18*/if(user.getLimitedaccount() != null)/*102.54*/{_display_(Seq[Any](format.raw/*102.55*/("""
                """),format.raw/*103.17*/("""<tr>
                    <th>Limitedaccount</th>
                    <td>"""),_display_(/*105.26*/user/*105.30*/.getLimitedaccount()),format.raw/*105.50*/("""</td>
                </tr>
                """)))}),format.raw/*107.18*/("""
                """),_display_(/*108.18*/if(user.getCode() != null)/*108.44*/{_display_(Seq[Any](format.raw/*108.45*/("""
                """),format.raw/*109.17*/("""<tr>
                    <th>CountryCode</th>
                    <td>"""),_display_(/*111.26*/user/*111.30*/.getCode()),format.raw/*111.40*/("""</td>
                </tr>
                """)))}),format.raw/*113.18*/("""
                """),_display_(/*114.18*/if(user.getSign() != null)/*114.44*/{_display_(Seq[Any](format.raw/*114.45*/("""
                """),format.raw/*115.17*/("""<tr>
                    <th>CountrySign</th>
                    <td>"""),_display_(/*117.26*/user/*117.30*/.getSign()),format.raw/*117.40*/("""</td>
                </tr>
                """)))}),format.raw/*119.18*/("""
                """),_display_(/*120.18*/if(user.getCurrencyname() != null)/*120.52*/{_display_(Seq[Any](format.raw/*120.53*/("""
                """),format.raw/*121.17*/("""<tr>
                    <th>CurrencyName</th>
                    <td>"""),_display_(/*123.26*/user/*123.30*/.getCurrencyname()),format.raw/*123.48*/("""</td>
                </tr>
                """)))}),format.raw/*125.18*/("""
                """),_display_(/*126.18*/if(user.getPublicname() != null)/*126.50*/{_display_(Seq[Any](format.raw/*126.51*/("""
                """),format.raw/*127.17*/("""<tr>
                    <th>Publicname</th>
                    <td>"""),_display_(/*129.26*/user/*129.30*/.getPublicname()),format.raw/*129.46*/("""</td>
                </tr>
                """)))}),format.raw/*131.18*/("""
                """),_display_(/*132.18*/if(user.getEmailverified() != null)/*132.53*/{_display_(Seq[Any](format.raw/*132.54*/("""
                """),format.raw/*133.17*/("""<tr>
                    <th>Email_Verified</th>
                    <td>"""),_display_(/*135.26*/user/*135.30*/.getEmailverified()),format.raw/*135.49*/("""</td>
                </tr>
                """)))}),format.raw/*137.18*/("""
                """),_display_(/*138.18*/if(user.getTimezone() != null)/*138.48*/{_display_(Seq[Any](format.raw/*138.49*/("""
                """),format.raw/*139.17*/("""<tr>
                    <th>TimeZone</th>
                    <td>"""),_display_(/*141.26*/user/*141.30*/.getTimezone()),format.raw/*141.44*/("""</td>
                </tr>
                """)))}),format.raw/*143.18*/("""
                """),_display_(/*144.18*/if(user.getSkills().size()>0)/*144.47*/{_display_(Seq[Any](format.raw/*144.48*/("""
                """),format.raw/*145.17*/("""<tr>
                    <th>Skills</th>
                    <td>"""),_display_(/*147.26*/for((key,value) <- user.getSkills()) yield /*147.62*/{_display_(Seq[Any](format.raw/*147.63*/("""
                        """),_display_(/*148.26*/key),format.raw/*148.29*/("""
                        """)))}),format.raw/*149.26*/("""
                    """),format.raw/*150.21*/("""</td>
                </tr>
                """)))}/*152.18*/else/*152.22*/{_display_(Seq[Any](format.raw/*152.23*/("""
                """),format.raw/*153.17*/("""<tr>
                    <th>Skills</th>
                    <td>Users does not have any skills</td>
                </tr>
                """)))}),format.raw/*157.18*/("""
                """),_display_(/*158.18*/if( user.getQualifications().size()>0)/*158.56*/{_display_(Seq[Any](format.raw/*158.57*/("""
                """),format.raw/*159.17*/("""<tr>
                    <th>Qualifications</th>
                    <td>"""),_display_(/*161.26*/for((key,value) <- user.getQualifications()) yield /*161.70*/{_display_(Seq[Any](format.raw/*161.71*/("""
                        """),_display_(/*162.26*/key),format.raw/*162.29*/("""
                        """)))}),format.raw/*163.26*/("""
                    """),format.raw/*164.21*/("""</td>
                </tr>
                """)))}/*166.18*/else/*166.22*/{_display_(Seq[Any](format.raw/*166.23*/("""
                """),format.raw/*167.17*/("""<tr>
                    <th>Qualifications</th>
                    <td>Users does not have any Qualifications</td>
                </tr>
                """)))}),format.raw/*171.18*/("""
            """),format.raw/*172.13*/("""</table>
            <h3>Projects</h3>
            <table>
                """),_display_(/*175.18*/if( user.getProjects().size()>0)/*175.50*/{_display_(Seq[Any](format.raw/*175.51*/("""
                """),format.raw/*176.17*/("""<tr>
                    <th>Project Id</th>
                    <th>Submit Date</th>
                    <th>Title</th>
                    <th>Description</th>
                </tr>
                """),_display_(/*182.18*/for(projects <- user.getProjects()) yield /*182.53*/{_display_(Seq[Any](format.raw/*182.54*/("""
                """),format.raw/*183.17*/("""<tr>
                    <td>"""),_display_(/*184.26*/projects/*184.34*/.getProjectid()),format.raw/*184.49*/("""</td>
                    <td>"""),_display_(/*185.26*/projects/*185.34*/.getSubmitdate()),format.raw/*185.50*/("""</td>
                    <td>"""),_display_(/*186.26*/projects/*186.34*/.getTitle()),format.raw/*186.45*/("""</td>
                    <td>"""),_display_(/*187.26*/projects/*187.34*/.getDescription()),format.raw/*187.51*/("""</td>
                </tr>
                """)))}),format.raw/*189.18*/("""
                """)))}/*190.18*/else/*190.22*/{_display_(Seq[Any](format.raw/*190.23*/("""
                """),format.raw/*191.17*/("""<p>This user does not have project</p>
                """)))}),format.raw/*192.18*/("""
            """),format.raw/*193.13*/("""</table>
            """)))}),format.raw/*194.14*/("""
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
                  HASH: 369d87851dac4fd1c570823a39b9cd0c94804222
                  MATRIX: 611->1|639->24|984->51|1116->88|1146->93|1174->113|1213->115|1241->117|1345->195|1378->220|1417->222|1459->237|1516->278|1555->279|1597->293|1677->346|1709->357|1794->414|1823->415|1881->445|1961->497|1990->498|2044->524|2075->527|2104->528|2162->558|2288->656|2317->657|2371->683|2406->690|2435->691|2493->721|2661->861|2690->862|2740->884|2829->946|2862->970|2902->972|2948->990|3045->1060|3058->1064|3087->1072|3165->1119|3211->1138|3250->1168|3289->1169|3335->1187|3432->1257|3445->1261|3480->1275|3558->1322|3606->1343|3644->1372|3683->1373|3729->1391|3825->1460|3838->1464|3872->1477|3950->1524|3996->1543|4031->1569|4070->1570|4116->1588|4209->1654|4222->1658|4253->1668|4331->1715|4377->1734|4412->1760|4451->1761|4497->1779|4590->1845|4603->1849|4634->1859|4712->1906|4758->1925|4799->1957|4838->1958|4884->1976|4984->2049|4997->2053|5034->2069|5112->2116|5158->2135|5207->2175|5246->2176|5292->2194|5399->2274|5412->2278|5457->2302|5535->2349|5581->2368|5627->2405|5666->2406|5712->2424|5816->2501|5829->2505|5871->2526|5949->2573|5995->2592|6042->2630|6081->2631|6127->2649|6230->2725|6243->2729|6286->2751|6364->2798|6410->2817|6448->2846|6487->2847|6533->2865|6629->2934|6642->2938|6676->2951|6754->2998|6800->3017|6842->3050|6881->3051|6927->3069|7027->3142|7040->3146|7078->3163|7156->3210|7202->3229|7248->3266|7287->3267|7333->3285|7437->3362|7450->3366|7492->3387|7571->3434|7618->3453|7664->3489|7704->3490|7751->3508|7855->3584|7869->3588|7911->3608|7990->3655|8037->3674|8073->3700|8113->3701|8160->3719|8261->3792|8275->3796|8307->3806|8386->3853|8433->3872|8469->3898|8509->3899|8556->3917|8657->3990|8671->3994|8703->4004|8782->4051|8829->4070|8873->4104|8913->4105|8960->4123|9062->4197|9076->4201|9116->4219|9195->4266|9242->4285|9284->4317|9324->4318|9371->4336|9471->4408|9485->4412|9523->4428|9602->4475|9649->4494|9694->4529|9734->4530|9781->4548|9885->4624|9899->4628|9940->4647|10019->4694|10066->4713|10106->4743|10146->4744|10193->4762|10291->4832|10305->4836|10341->4850|10420->4897|10467->4916|10506->4945|10546->4946|10593->4964|10689->5032|10742->5068|10782->5069|10837->5096|10862->5099|10921->5126|10972->5148|11039->5195|11053->5199|11093->5200|11140->5218|11316->5362|11363->5381|11411->5419|11451->5420|11498->5438|11602->5514|11663->5558|11703->5559|11758->5586|11783->5589|11842->5616|11893->5638|11960->5685|11974->5689|12014->5690|12061->5708|12253->5868|12296->5882|12403->5961|12445->5993|12485->5994|12532->6012|12767->6219|12819->6254|12859->6255|12906->6273|12965->6304|12983->6312|13020->6327|13080->6359|13098->6367|13136->6383|13196->6415|13214->6423|13247->6434|13307->6466|13325->6474|13364->6491|13443->6538|13482->6557|13496->6561|13536->6562|13583->6580|13672->6637|13715->6651|13770->6674|13817->6689|13855->6699
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|43->12|45->14|45->14|46->15|47->16|47->16|48->17|48->17|48->17|49->18|51->20|51->20|52->21|52->21|52->21|53->22|57->26|57->26|58->27|60->29|60->29|60->29|61->30|63->32|63->32|63->32|65->34|66->35|66->35|66->35|67->36|69->38|69->38|69->38|71->40|73->42|73->42|73->42|74->43|76->45|76->45|76->45|78->47|79->48|79->48|79->48|80->49|82->51|82->51|82->51|84->53|85->54|85->54|85->54|86->55|88->57|88->57|88->57|90->59|91->60|91->60|91->60|92->61|94->63|94->63|94->63|96->65|97->66|97->66|97->66|98->67|100->69|100->69|100->69|102->71|103->72|103->72|103->72|104->73|106->75|106->75|106->75|108->77|109->78|109->78|109->78|110->79|112->81|112->81|112->81|114->83|115->84|115->84|115->84|116->85|118->87|118->87|118->87|120->89|121->90|121->90|121->90|122->91|124->93|124->93|124->93|126->95|127->96|127->96|127->96|128->97|130->99|130->99|130->99|132->101|133->102|133->102|133->102|134->103|136->105|136->105|136->105|138->107|139->108|139->108|139->108|140->109|142->111|142->111|142->111|144->113|145->114|145->114|145->114|146->115|148->117|148->117|148->117|150->119|151->120|151->120|151->120|152->121|154->123|154->123|154->123|156->125|157->126|157->126|157->126|158->127|160->129|160->129|160->129|162->131|163->132|163->132|163->132|164->133|166->135|166->135|166->135|168->137|169->138|169->138|169->138|170->139|172->141|172->141|172->141|174->143|175->144|175->144|175->144|176->145|178->147|178->147|178->147|179->148|179->148|180->149|181->150|183->152|183->152|183->152|184->153|188->157|189->158|189->158|189->158|190->159|192->161|192->161|192->161|193->162|193->162|194->163|195->164|197->166|197->166|197->166|198->167|202->171|203->172|206->175|206->175|206->175|207->176|213->182|213->182|213->182|214->183|215->184|215->184|215->184|216->185|216->185|216->185|217->186|217->186|217->186|218->187|218->187|218->187|220->189|221->190|221->190|221->190|222->191|223->192|224->193|225->194|226->195|227->196
                  -- GENERATED --
              */
          