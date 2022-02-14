import java.util.*;
class Problem8 {
public static void main(String args[] ) throws Exception {
Scanner s = new Scanner(System.in);
int n = Integer.parseInt(s.nextLine());
for (int i=0; i<n; i++){
    
    String strS = s.nextLine();
    String strT = s.nextLine();
    HashMap<Character, Integer> hashmapS = new HashMap<Character, Integer>(strS.length());
    HashMap<Character, Integer> hashmapT = new HashMap<Character, Integer>(strT.length());

for (int j=0; j<strS.length(); j++){

Character c = new Character(strS.charAt(j));

if (hashmapS.containsKey(c)){

hashmapS.replace(c, hashmapS.get(c)+1);

}

else{

hashmapS.put(c, 1);

}

}



for (int j=0; j<strT.length(); j++){

Character c = new Character(strT.charAt(j));

if (hashmapT.containsKey(c)){

hashmapT.replace(c, hashmapT.get(c)+1);

}

else{

hashmapT.put(c, 1);

}

}

int sum = 0;



for (Character key: hashmapS.keySet()){

if (hashmapT.containsKey(key)){



sum += Math.abs(hashmapS.get(key) - hashmapT.get(key));

}

else{
sum += hashmapS.get(key);
}
}
for (Character key: hashmapT.keySet()){

if (!hashmapS.containsKey(key)){
sum += hashmapT.get(key);
}
}
System.out.println(sum);
}
  }
}
