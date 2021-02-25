public class Contact {
    String name;
    String email;
    String phoneno;

}
class ContactsManager{
    Contact [] myFriends;
    int Friendscount;

    ContactsManager(){
        this.Friendscount = 0;
        this.myFriends = new Contact[500];
    }
    void addContact(Contact contact){
        myFriends[Friendscount] = contact;
        Friendscount++;
    }
    Contact searchcontact(String searchname){
        for(int i = 0; i<Friendscount; i++){
            if(myFriends[i].name.equals(searchname)){
                return myFriends[i];
            }
        }
        return null;
    }
}

class Main{
    public static void main(String [] args){
        ContactsManager mymanager = new ContactsManager();

        Contact friendaksh = new Contact();
        friendaksh.name = "Akshay";
        friendaksh.phoneno = "7506005253";
        mymanager.addContact(friendaksh);

        Contact friendrit = new Contact();
        friendaksh.name = "Ritika";
        friendaksh.phoneno = "7506002272";
        mymanager.addContact(friendrit);

        Contact friendmah = new Contact();
        friendaksh.name = "Mahesh";
        friendaksh.phoneno = "9820594058";
        mymanager.addContact(friendmah);

        Contact friendanu = new Contact();
        friendaksh.name = "Anuradha";
        friendaksh.phoneno = "9967772280";
        mymanager.addContact(friendanu);

        Contact result = mymanager.searchcontact("Anuradha");
        System.out.println(result.phoneno);


    }
}

