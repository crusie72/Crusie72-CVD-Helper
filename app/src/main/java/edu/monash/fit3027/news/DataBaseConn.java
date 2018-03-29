package edu.monash.fit3027.news;

/**
 * Created by hemanth kumar pujari on 23/03/2018.
 *
 *
 * This java class handles all database related functions like updating and inserting data into database
 *
 * */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBaseConn extends SQLiteOpenHelper {
    // Attributes
    public static final String DB_NAME = "TeamDB109";
    public static final String TABLE_NAME1 = "Diseases";
    public static final String COLUMN_1 = "Type";
    public static final String COLUMN_2 = "Description";
    public static final String COLUMN_3 = "Causes";
    public static final String COLUMN_4 = "symptoms";
    public static final String COLUMN_5 = "Prevention";
    public static final String COLUMN_6 = "soruce";




    public DataBaseConn(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table diseases (TYPE TEXT,DESCRIPTION TEXT,CAUSES TEXT,SYMPTOMS INTEGER,PREVENTION TEXT,SOURCE TEXT)");
        //inserting Row1 data
        String type1_name = "Coronary heart disease";
        String type1_des = "disease of the blood vessels supplying the heart muscle";
        String type1_causes = "age, tobacco smoking, high blood cholesterol, physical inactivity, poor nutrition and obesity";
        String type1_symp = "Chest pain or discomfort,Upper body discomfort in one or both arms, the back, neck, jaw, or upper part of the stomach\n" +
                "Shortness of breath, which may occur with or before chest discomfort\n" +
                "Nausea (feeling sick to your stomach), vomiting, light-headedness or fainting, or breaking out in a cold sweat\n" +
                "Sleep problems, fatigue (tiredness), or lack of energy";
        String type1_prevention = "take your medicines as prescribed, be smoke-free, enjoy healthy eating, be physically active, control your blood pressure and cholesterol, achieve and maintain a healthy body weight, maintain your psychological and social health.";
        String type1_source = "https://www.aihw.gov.au/getmedia/2a44d779-bff1-4302-b129-f515e7b07842/ah16-3-5-coronary-heart-disease.pdf.aspx http://www.who.int/mediacentre/factsheets/fs317/en/\n" +
                "https://www.nhlbi.nih.gov/node/3495\n" +
                "http://healthywa.wa.gov.au/Articles/A_E/Coronary-heart-disease";
        String sql  = "insert into diseases values ( '"+ type1_name+"','"+type1_des+"','"+type1_causes+"','"+type1_symp+"','"+type1_prevention+"', '"+type1_source+"')";

        //inserting Row2 data

        String type2_name = "Rheumatic heart disease";
        String type2_des = "damage to the heart muscle and heart valves from rheumatic fever, caused by streptococcal bacteria";
        String type2_causes = "poverty, overcrowding and reduced access to medical care.";
        String type2_symp = "Chest pain\n" +
                "Heart palpitations\n" +
                "Breathlessness on exertion\n" +
                "Breathing problems when lying down (orthopnoea)\n" +
                "Waking from sleep with the need to sit or stand up (paroxysmal nocturnal dyspnoea)\n" +
                "Swelling (oedema)\n" +
                "Fainting (syncope)\n" +
                "Stroke\n" +
                "Fever associated with infection of damaged heart valves.";
        String type2_prevention = "Antibiotic therapy (such as penicillin) to treat Group A Streptococcus throat infection can dramatically reduce the risk of ARF and its complication, rheumatic heart disease. If ARF or RHD do occur, long-term antibiotics can reduce progression to more severe disease.";
        String type2_source = "https://www.betterhealth.vic.gov.au/health/conditionsandtreatments/rheumatic-heart-disease\n" +
                "http://www.ehealthyblog.com/heart-diseases/what-are-the-rheumatic-heart-disease-symptoms.html";
        String sql2  = "insert into diseases values ( '"+ type2_name+"','"+type2_des+"','"+type2_causes+"','"+type2_symp+"','"+type2_prevention+"', '"+type2_source+"')";

        //inserting Row3 data

        String type3_name = "Cerebrovascular disease";
        String type3_des = "disease of the blood vessels supplying the brain";
        String type3_causes = "hypertension, smoking, obesity, poor diet, lack of exercise, diabetes, high blood cholesterol, Moyamoya disease, venous angiomas, a vein of Galen malformation";
        String type3_symp = "a severe and sudden headache, paralysis of one side, weakness on one side, confusion, difficulty communicating, including slurred speech, loss of half of vision, loss of balance, loss of consciousness";
        String type3_prevention = "quitting smoke, getting regular physical exercise, eating a heart-healthy, low-fat diet, avoiding obesity, controlling blood pressure and hypertension, lowering cholesterol, and avoiding chronic stress or anger. ";
        String type3_source = "https://www.medicalnewstoday.com/articles/184601.php\n" +
                "http://www.who.int/mediacentre/factsheets/fs317/en/\n" +
                "https://www.pinterest.com.au/pin/504825439454109119/";
        String sql3  = "insert into diseases values ( '"+ type3_name+"','"+type3_des+"','"+type3_causes+"','"+type3_symp+"','"+type3_prevention+"', '"+type3_source+"')";

        //inserting Row4 data

        String type4_name = "Congenital heart disease";
        String type4_des = "malformations of heart structure existing at birth";
        String type4_causes = "CHDs also are thought to be caused by a combination of genes and other factors, such as things in the environment, the mother’s diet, the mother’s health conditions, or the mother’s medication use during pregnancy.";
        String type4_symp = "Rapid breathing\n" +
                "Cyanosis - a bluish tint to the skin, lips, and fingernails\n" +
                "Fatigue\n" +
                "Poor blood circulation";
        String type4_prevention = "No Prevention measures at born stage";
        String type4_source = "https://www.cdc.gov/ncbddd/heartdefects/facts.html\n" +
                "https://www.mayoclinic.org/diseases-conditions/adult-congenital-heart-disease/symptoms-causes/syc-20355456?utm_source=Google&utm_medium=abstract&utm_content=Congenital-heart-defect&utm_campaign=Knowledge-panel";
        String sql4  = "insert into diseases values ( '"+ type4_name+"','"+type4_des+"','"+type4_causes+"','"+type4_symp+"','"+type4_prevention+"', '"+type4_source+"')";

        //inserting Row5 data

        String type5_name = "Peripheral arterial disease";
        String type5_des = "disease of blood vessels supplying the arms and legs";
        String type5_causes = "anything that prevents your blood from circulating or clotting normally, such as injury to a vein, surgery, certain medications and limited movement.";
        String type5_symp = "Pain in your leg. \n" +
                "Red or discolored skin on the leg.\n" +
                "A feeling of warmth in the affected leg.                      \n" +
                "Sudden shortness of breath \n" +
                "Feeling lightheaded or dizzy, or fainting\n" +
                "Rapid pulse\n" +
                "Coughing up blood   \n" +
                "Chest pain or discomfort that worsens when you take a deep breath or when you cough";
        String type5_prevention = "Avoid sitting still\n" +
                "Lose weight and quit smoking.\n" +
                "Regular exercise lowers your risk of blood clots";
        String type5_source = "https://www.mayoclinic.org/diseases-conditions/deep-vein-thrombosis/symptoms-causes/syc-20352557";
        String sql5  = "insert into diseases values ( '"+ type5_name+"','"+type5_des+"','"+type5_causes+"','"+type5_symp+"','"+type5_prevention+"', '"+type5_source+"')";

        //inserting Row6 data

        String type6_name = "Deep vein thrombosis and pulmonary embolism";
        String type6_des = "blood clots in the leg veins, which can dislodge and move to the heart and lungs.";
        String type6_causes = "anything that prevents your blood from circulating or clotting normally, such as injury to a vein, surgery, certain medications and limited movement.";
        String type6_symp = "Pain in your leg. \n" +
                "Red or discolored skin on the leg.\n" +
                "A feeling of warmth in the affected leg.                      \n" +
                "Sudden shortness of breath \n" +
                "Feeling lightheaded or dizzy, or fainting\n" +
                "Rapid pulse\n" +
                "Coughing up blood   \n" +
                "Chest pain or discomfort that worsens when you take a deep breath or when you cough";
        String type6_prevention = "Avoid sitting still\n" +
                "Lose weight and quit smoking.\n" +
                "Regular exercise lowers your risk of blood clots";
        String type6_source = "https://www.mayoclinic.org/diseases-conditions/deep-vein-thrombosis/symptoms-causes/syc-20352557";
        String sql6  = "insert into diseases values ( '"+ type6_name+"','"+type6_des+"','"+type6_causes+"','"+type6_symp+"','"+type6_prevention+"', '"+type6_source+"')";

        //excuting quries

        db.execSQL(sql);
        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql4);
        db.execSQL(sql5);
        db.execSQL(sql6);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        onCreate(db);
    }

    public boolean insertData(String userid,String fname,String lname,int age,String gender,String pwd,int pin) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        long result = db.insert(TABLE_NAME1,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME1,null);
        return res;
    }

    // getSelected function return the data according user selected disease in the diseases list

    public Cursor getselectedData(String finalresult) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from  diseases where type = '"+finalresult+"'",null);
        return res;
    }
 }
