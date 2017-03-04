class cuboidLength
{
int l;
void getLength()
{
l = 20;
System.out.println("Length of a Cuboid is:" +l);
}
}
class cuboidBaseHeight extends cuboidLength
{
int b, h;
void getBaseHeight()
{
b = 30;
h = 10;
System.out.println("Base of a cuboid is:" +b);
System.out.println("Base of a cuboid is:" +h);
}
public double cuboidVolume()
{
double vol = l*b*h;
return vol;
}
}
class cuboid
{
public static void main(String[] args)
{
cuboidBaseHeight c = new cuboidBaseHeight();
c.getLength();
c.getBaseHeight();
c.cuboidVolume();
System.out.println("Volume of the cuboid is:" +c.cuboidVolume());
}
}
