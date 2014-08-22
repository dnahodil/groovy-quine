/* A counting Quine, written in Groovy by David Nahodil           */
/* Supports counting in Binary, Octal, Decimal and Hexadecimal    */
/*                                                                */
/* Usage: `groovy quine-3.groovy [args]`                          */
/* * No args - increments number using current base               */
/* * One arg - outputs specified number using current base        */
/* * Two args - outputs specified number using specified base     */
/*              (b: binary, o: octal, d: decimal, h: hexadecimal) */ def _="""\

  ### 
 #  ##
 # # #
 ##  #
  ### 

""";import java.math.BigInteger as BI;import java.lang.StringBuffer as SB;
import java.lang.String as S;import static java.lang.Integer.parseInt as pi;
def cmn='03f87210';def hs=cmn.size();def tgts=['2e9d72e',
'000ac97','016924f','01f171f','46292fc2','83e','e3f','11110','ba3f','fc21',
'024547f1','e8fa3e','00178887','e8c63e','f',''];tgts.eachWithIndex{it,idx->
def d=hs-it.size();def fb=d?cmn[0..d-1]:'';tgts[idx]=fb+it};def nl=''+(10as
char);def bc='01';def ic=' #';def a=args;def h=(int)_.split(nl).findAll{it.
size()}.size();def s2f={def sb=new SB(it);(h..1).each{rn->sb.insert((rn*((int)it
.size()/h)),nl)};"$nl$sb$nl"};def bs=a?.size()>1?a[1]:"d";def b=['b':2,
'o':8,'d':10,'h':16][bs];def d2f={def dls=tgts.collect{s2f(new BI(it,16).
toString(2)[1..-1].tr(bc,ic)).split(nl).findAll{it.size()}};def sb=new SB().
append(nl);h.times{r->Integer.toString(it,b).split('').tail().collect{pi(it,b)}
.each{d->sb.append(" ${dls[d][r]}")};sb.append nl};sb.toString();};def f2d={f->
2.times{while(f.startsWith(nl))f=f.replaceFirst(nl,'');f=f.reverse();};def w=f.
split(nl).first().size();def bcs=(0..w)as SortedSet;f.eachLine{l,lidx->
def bcstl=[]as Set;l.eachWithIndex{c,cidx->if(c==' ')bcstl.add cidx};bcs.
retainAll bcstl;};bcs<<w;def ds=[];bcs.toArray().eachWithIndex{cidx,tidx->if(
tidx){def tdls=[];f.eachLine{l->tdls<<l[(bcs[tidx-1]+1)..(cidx-1)];};ds<<tdls.
join(nl)}};ds.collect{tgts.indexOf(new BI('1'+it.replace(nl,'').tr(ic,bc),2).
toString(16).padLeft(hs,'0')+'')}};def p=this.&print;def pln=this.&println;
def d2n={def s=0;it.reverse().eachWithIndex{d,idx->s+=d*(b**idx)};++s};def m={
pln d2f(a&&a[0]?pi(a[0],b):d2n(f2d(_)))};def hl=7;def sl=(hl+1)..30;
def el=-4..-1;def q=39as char;def s=92as char;def dq=34as char;def d=36as char;
def src='''\
/* A counting Quine, written in Groovy by David Nahodil           */
/* Supports counting in Binary, Octal, Decimal and Hexadecimal    */
/*                                                                */
/* Usage: `groovy quine-3.groovy [args]`                          */
/* * No args - increments number using current base               */
/* * One arg - outputs specified number using current base        */
/* * Two args - outputs specified number using specified base     */
/*              (b: binary, o: octal, d: decimal, h: hexadecimal) */ def _="""
""";import java.math.BigInteger as BI;import java.lang.StringBuffer as SB;
import java.lang.String as S;import static java.lang.Integer.parseInt as pi;
def cmn='03f87210';def hs=cmn.size();def tgts=['2e9d72e',
'000ac97','016924f','01f171f','46292fc2','83e','e3f','11110','ba3f','fc21',
'024547f1','e8fa3e','00178887','e8c63e','f',''];tgts.eachWithIndex{it,idx->
def d=hs-it.size();def fb=d?cmn[0..d-1]:'';tgts[idx]=fb+it};def nl=''+(10as
char);def bc='01';def ic=' #';def a=args;def h=(int)_.split(nl).findAll{it.
size()}.size();def s2f={def sb=new SB(it);(h..1).each{rn->sb.insert((rn*((int)it
.size()/h)),nl)};"$nl$sb$nl"};def bs=a?.size()>1?a[1]:"d";def b=['b':2,
'o':8,'d':10,'h':16][bs];def d2f={def dls=tgts.collect{s2f(new BI(it,16).
toString(2)[1..-1].tr(bc,ic)).split(nl).findAll{it.size()}};def sb=new SB().
append(nl);h.times{r->Integer.toString(it,b).split('').tail().collect{pi(it,b)}
.each{d->sb.append(" ${dls[d][r]}")};sb.append nl};sb.toString();};def f2d={f->
2.times{while(f.startsWith(nl))f=f.replaceFirst(nl,'');f=f.reverse();};def w=f.
split(nl).first().size();def bcs=(0..w)as SortedSet;f.eachLine{l,lidx->
def bcstl=[]as Set;l.eachWithIndex{c,cidx->if(c==' ')bcstl.add cidx};bcs.
retainAll bcstl;};bcs<<w;def ds=[];bcs.toArray().eachWithIndex{cidx,tidx->if(
tidx){def tdls=[];f.eachLine{l->tdls<<l[(bcs[tidx-1]+1)..(cidx-1)];};ds<<tdls.
join(nl)}};ds.collect{tgts.indexOf(new BI('1'+it.replace(nl,'').tr(ic,bc),2).
toString(16).padLeft(hs,'0')+'')}};def p=this.&print;def pln=this.&println;
def d2n={def s=0;it.reverse().eachWithIndex{d,idx->s+=d*(b**idx)};++s};def m={
pln d2f(a&&a[0]?pi(a[0],b):d2n(f2d(_)))};def hl=7;def sl=(hl+1)..30;
def el=-4..-1;def q=39as char;def s=92as char;def dq=34as char;def d=36as char;
def ls=src.readLines();hl.times{pln ls[it]};p ls[hl];pln s;m();ls[sl].each{
pln it};pln "def src=$q$q$q$s";p src;
pln "$q$q${q}.replaceAll(/$dq[bodh]$dq/,$dq$s$dq${d}bs$s$dq$dq)";ls[el].
each{pln it};'''.replaceAll(/"[bodh]"/,"\"$bs\"")
def ls=src.readLines();hl.times{pln ls[it]};p ls[hl];pln s;m();ls[sl].each{
pln it};pln "def src=$q$q$q$s";p src;
pln "$q$q${q}.replaceAll(/$dq[bodh]$dq/,$dq$s$dq${d}bs$s$dq$dq)";ls[el].
each{pln it};
