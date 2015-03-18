```


boolean loeschen = false;

for(int y=0; y<20; y++){
for(int x=0; x<10; x++){
if(feld[y][x] == 0)
{
if(loeschen==true) loeschen=true;
//else loeschen=false;
}
else loeschen=false;
}
if(loeschen==true) loescheReihe(y);
}
```