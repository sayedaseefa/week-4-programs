public final class Genericmaximal
{
public static <T extends Object & Comparable<? super T>>
T max (List <? extends T> List,int begin,int end)
{
T maxElement=List.get(begin);
for(++begin;begin<end;++begin)
if(maxElem.compareTo(List.get(begin))<0)
maxElem=List.get(begin);
return maxElem;
}
}
