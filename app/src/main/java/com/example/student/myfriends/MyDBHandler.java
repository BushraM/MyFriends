package com.example.student.myfriends;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2/25/15.
 */
public class MyDBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static String DATABASE_NAME = "friends.db";
    public static final String FRIENDS = "friends";
    public static final String ID = "id";
    public static final String FRIEND_NAME = "name";
    public static final String FRIEND_PHONE = "phone";
    public static final String FRIEND_ADDRESS = "address";
    public static final String FRIEND_EMAIL = "email";

    public void setDatabaseName(String name){
        DATABASE_NAME = name;
    }

    public MyDBHandler(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_FRIENDS_TABLE = "CREATE TABLE " +
                FRIENDS + "("+ ID +" INTEGER PRIMARY KEY," +FRIEND_NAME + " TEXT," + FRIEND_PHONE + " TEXT," + FRIEND_ADDRESS +" TEXT"+
                FRIEND_EMAIL +" TEXT)";
        db.execSQL(CREATE_FRIENDS_TABLE);

        String enterRecord = "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (1,\"Xerxes Mcfadden\",\"(324) 120-7785\",\"Ap #638-741 Ac, Road\"),(2,\"Anjolie Flynn\",\"(568) 829-0183\",\"P.O. Box 621, 1536 Consequat, Av.\"),(3,\"Mollie Miles\",\"(965) 708-8627\",\"Ap #330-3481 Auctor, Ave\"),(4,\"Cally Christensen\",\"(514) 650-7702\",\"987 Laoreet St.\"),(5,\"Hasad Rosa\",\"(635) 829-3586\",\"8725 Nec Street\"),(6,\"Karina Mcgee\",\"(520) 729-6274\",\"208-6060 Arcu. Rd.\"),(7,\"Samuel Berg\",\"(161) 923-2401\",\"7419 Dui, Rd.\"),(8,\"Phelan Foreman\",\"(872) 274-8720\",\"P.O. Box 984, 5491 Nec Avenue\"),(9,\"Scott Willis\",\"(866) 658-8582\",\"3339 Curabitur Ave\"),(10,\"Maisie Madden\",\"(623) 763-6802\",\"Ap #498-5003 Feugiat Road\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (11,\"Dorothy Clay\",\"(347) 215-1043\",\"470-9082 Amet Ave\"),(12,\"Jacob Soto\",\"(632) 556-1468\",\"P.O. Box 143, 3768 Elementum, Rd.\"),(13,\"Mercedes Fletcher\",\"(646) 441-3553\",\"Ap #614-1616 Nullam Rd.\"),(14,\"Erich Wilson\",\"(877) 376-9637\",\"P.O. Box 624, 1788 Odio Rd.\"),(15,\"Uriah Lindsay\",\"(146) 374-3782\",\"P.O. Box 132, 9114 Enim Av.\"),(16,\"Dakota Hanson\",\"(704) 315-1960\",\"576-5562 Lorem Ave\"),(17,\"Addison Michael\",\"(668) 197-1850\",\"679-6685 Et Rd.\"),(18,\"Martin Forbes\",\"(950) 514-6787\",\"5497 Aliquam Rd.\"),(19,\"Inga Bryan\",\"(194) 113-3813\",\"3533 Malesuada. St.\"),(20,\"Uma Franks\",\"(485) 457-3578\",\"Ap #905-8290 Mauris Avenue\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (21,\"Edward Gay\",\"(816) 389-7562\",\"P.O. Box 458, 7983 Commodo Street\"),(22,\"Scarlett Bauer\",\"(717) 862-1733\",\"452 Quam. Av.\"),(23,\"Hashim Burt\",\"(840) 988-4002\",\"Ap #276-3477 Magna. Street\"),(24,\"Cruz Briggs\",\"(430) 320-2879\",\"P.O. Box 968, 3953 Sapien, Avenue\"),(25,\"Dalton Taylor\",\"(859) 999-9184\",\"874-2393 Auctor St.\"),(26,\"Dahlia Velazquez\",\"(773) 934-3141\",\"406-6412 Dui. St.\"),(27,\"Bevis Duncan\",\"(397) 467-8570\",\"542-1004 Magnis Rd.\"),(28,\"Nicholas Humphrey\",\"(808) 755-4718\",\"Ap #170-9097 At, Rd.\"),(29,\"Hilel Freeman\",\"(965) 563-9913\",\"9777 Egestas St.\"),(30,\"Murphy Carey\",\"(109) 184-5129\",\"P.O. Box 923, 6658 Nulla St.\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (31,\"Nomlanga Ingram\",\"(575) 961-1893\",\"Ap #640-9271 Mollis. Rd.\"),(32,\"Alma Branch\",\"(524) 795-5214\",\"1737 Nulla Road\"),(33,\"Joshua Mayo\",\"(847) 580-1391\",\"P.O. Box 954, 6597 A, Avenue\"),(34,\"Camille Carney\",\"(984) 505-6868\",\"448-2759 Turpis Avenue\"),(35,\"Susan Gates\",\"(983) 758-2245\",\"6549 Arcu. Avenue\"),(36,\"Herman Whitehead\",\"(200) 994-9836\",\"Ap #480-9450 Eu Ave\"),(37,\"Otto Douglas\",\"(972) 332-7452\",\"7013 Et Ave\"),(38,\"Kitra Hampton\",\"(707) 398-2514\",\"4018 Nec Rd.\"),(39,\"Carly Gonzales\",\"(114) 293-1626\",\"Ap #972-6614 Ante St.\"),(40,\"Laurel Rice\",\"(524) 533-7077\",\"7070 Erat, Rd.\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (41,\"Cairo Brady\",\"(299) 159-0798\",\"248-9276 Tellus. Ave\"),(42,\"Jacqueline Barry\",\"(393) 605-5649\",\"Ap #818-5599 Quis Rd.\"),(43,\"Basia Holman\",\"(993) 714-4046\",\"P.O. Box 678, 386 Mauris Rd.\"),(44,\"Karly Mayo\",\"(604) 914-2667\",\"7464 Mi, Av.\"),(45,\"Tamara Richard\",\"(786) 358-5937\",\"Ap #958-4261 Est, Av.\"),(46,\"Alisa Harris\",\"(770) 857-2385\",\"Ap #316-1118 Sed St.\"),(47,\"Kennan Harrison\",\"(334) 239-1899\",\"Ap #901-5307 Vulputate, St.\"),(48,\"Porter Bean\",\"(243) 818-9721\",\"829-7994 Nec, Avenue\"),(49,\"Cassidy Copeland\",\"(392) 900-4165\",\"9506 Non, Ave\"),(50,\"Roary Long\",\"(436) 481-3599\",\"3921 Molestie. Street\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (51,\"Stacy Dorsey\",\"(863) 360-7645\",\"P.O. Box 232, 9730 Massa. Rd.\"),(52,\"Preston William\",\"(685) 524-1605\",\"240-6435 Nam Ave\"),(53,\"Xenos Bradley\",\"(448) 666-8930\",\"P.O. Box 662, 465 Nunc Street\"),(54,\"Martha Valenzuela\",\"(527) 158-3936\",\"Ap #612-5445 Nullam Av.\"),(55,\"Emery Summers\",\"(790) 829-0153\",\"P.O. Box 435, 9132 Dolor. Street\"),(56,\"Fay Sparks\",\"(758) 379-2501\",\"7151 Eros. St.\"),(57,\"Leroy Lowe\",\"(377) 427-8296\",\"984-9191 Eget Street\"),(58,\"Xyla Gay\",\"(359) 448-9623\",\"1728 Tincidunt, Avenue\"),(59,\"Rhoda Sanchez\",\"(169) 967-1011\",\"Ap #680-9403 Gravida Avenue\"),(60,\"Chanda Boyd\",\"(380) 574-2218\",\"P.O. Box 702, 6522 Nunc Road\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (61,\"Sloane Jones\",\"(514) 841-3280\",\"Ap #193-4445 Penatibus Street\"),(62,\"Wallace Clements\",\"(860) 527-8276\",\"422-6526 Mi St.\"),(63,\"Hiram Gordon\",\"(126) 736-6919\",\"P.O. Box 557, 8848 Proin Rd.\"),(64,\"Regan Carney\",\"(353) 772-2485\",\"P.O. Box 684, 5319 Nunc Street\"),(65,\"Lydia Noble\",\"(686) 950-6647\",\"Ap #354-7701 Aliquam, Rd.\"),(66,\"Colleen Dean\",\"(969) 874-9087\",\"5460 Et Ave\"),(67,\"Yen Schneider\",\"(183) 856-7923\",\"7893 Dui. Av.\"),(68,\"Jonas Moses\",\"(970) 217-6335\",\"648-2556 In St.\"),(69,\"Amos Mills\",\"(878) 186-0091\",\"4793 Cursus, Ave\"),(70,\"Serena David\",\"(102) 456-1326\",\"P.O. Box 644, 6488 Sem Avenue\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (71,\"Emi Newton\",\"(139) 266-7994\",\"P.O. Box 621, 2931 Erat St.\"),(72,\"Petra Moses\",\"(540) 184-7293\",\"P.O. Box 569, 682 Sed St.\"),(73,\"Kirk Randolph\",\"(448) 213-9603\",\"Ap #477-1751 At Rd.\"),(74,\"Reagan Hansen\",\"(131) 407-4624\",\"686-7164 Tortor, Ave\"),(75,\"Martina Rivas\",\"(452) 745-0205\",\"Ap #409-2313 Nibh. Street\"),(76,\"Tanisha Taylor\",\"(233) 743-8559\",\"P.O. Box 439, 7898 Ullamcorper, St.\"),(77,\"Fatima Faulkner\",\"(963) 471-0899\",\"8912 Feugiat Av.\"),(78,\"Kalia Erickson\",\"(524) 513-0896\",\"4598 Posuere Av.\"),(79,\"Ferdinand Winters\",\"(258) 355-7278\",\"Ap #676-136 Euismod Street\"),(80,\"Wayne Haley\",\"(617) 859-8563\",\"Ap #654-3312 Rutrum Street\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (81,\"Logan Everett\",\"(889) 569-7590\",\"Ap #638-1101 Nec, Avenue\"),(82,\"Eliana Cline\",\"(346) 997-6834\",\"938-6863 Lobortis Road\"),(83,\"Drake Petty\",\"(301) 661-4099\",\"913 Rhoncus Road\"),(84,\"Driscoll Fischer\",\"(664) 738-3065\",\"Ap #975-5358 Ligula St.\"),(85,\"Yen Hinton\",\"(899) 509-7923\",\"975-1164 Sollicitudin Rd.\"),(86,\"Marny Hays\",\"(748) 907-5546\",\"P.O. Box 771, 6089 Mattis Rd.\"),(87,\"Jennifer Juarez\",\"(166) 783-2635\",\"966-3056 Sit Av.\"),(88,\"Sierra Blevins\",\"(782) 335-5470\",\"P.O. Box 575, 7785 Pede, Avenue\"),(89,\"Martena Hines\",\"(804) 368-4036\",\"Ap #706-2097 Suspendisse Street\"),(90,\"TaShya Melton\",\"(719) 962-4880\",\"Ap #618-6159 Et Avenue\");"
                + "INSERT INTO `Friends` (`id`,`name`,`phone`,`address`) VALUES (91,\"Lavinia Keller\",\"(729) 491-0465\",\"P.O. Box 359, 8674 Tristique Street\"),(92,\"Maisie Smith\",\"(795) 151-6257\",\"8521 Diam St.\"),(93,\"Alika Rose\",\"(205) 240-9178\",\"7585 Aliquet Ave\"),(94,\"August Rhodes\",\"(586) 242-5674\",\"P.O. Box 332, 1981 Mauris St.\"),(95,\"Wing Tucker\",\"(639) 635-8526\",\"P.O. Box 982, 3787 Elit. Road\"),(96,\"Harriet Quinn\",\"(722) 358-7399\",\"Ap #165-9298 Neque. St.\"),(97,\"Lynn Tillman\",\"(438) 996-1340\",\"2694 Aliquet Av.\"),(98,\"Kelly Yates\",\"(816) 800-7839\",\"P.O. Box 404, 1086 At, Road\"),(99,\"Sonia Small\",\"(159) 203-4530\",\"P.O. Box 348, 9301 Sed Rd.\"),(100,\"Jaden Knight\",\"(749) 446-0308\",\"P.O. Box 537, 6906 Enim Street\");";

        db.execSQL(enterRecord);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FRIENDS);
        onCreate(db);
    }


    public List<Friend> getAllFriends() {
        String query = "Select * FROM " + FRIENDS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        List<Friend> friends = new ArrayList<Friend>();
        //boolean firstTime = true;

        Friend friend = new Friend();

        for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
            friend.set_id(Integer.parseInt(cursor.getString(0)));
            friend.set_name(cursor.getString(1));
            friend.set_phone(cursor.getString(2));
            friend.set_address(cursor.getString(3));
            friend.setEmail(cursor.getString(4));
            friends.add(friend);

        }
/*
        while ( cursor.moveToFirst() ) {

            do{
                friend.set_id(Integer.parseInt(cursor.getString(0)));
                friend.set_name(cursor.getString(1));
                friend.set_phone(cursor.getString(2));
                friend.set_address(cursor.getString(3));
                friend.setEmail(cursor.getString(4));
                cursor.close();
                friends.add(friend);
            }while(cursor.moveToNext());

        }*/
        db.close();
        return  friends;
    }

    public Friend findFriend(int id) {
        String query = "Select * FROM " + FRIENDS + " WHERE " + ID + " =  \"" + id + "\"";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        Friend friend = new Friend();

        if (cursor.moveToFirst()) {
            cursor.moveToFirst();
            friend.set_id(Integer.parseInt(cursor.getString(0)));
            friend.set_name(cursor.getString(1));
            friend.set_phone(cursor.getString(2));
            friend.set_address(cursor.getString(3));
            friend.setEmail(cursor.getString(4));
            cursor.close();
        } else {
            friend = null;
        }
        db.close();
        return friend;
    }


}
