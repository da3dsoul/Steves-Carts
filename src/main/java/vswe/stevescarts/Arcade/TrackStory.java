package vswe.stevescarts.Arcade;

import java.util.ArrayList;
import vswe.stevescarts.Helpers.Localization;

public class TrackStory
{
    public static ArrayList<TrackStory> stories = new ArrayList();
    private Localization.STORIES.THE_BEGINNING name;
    private ArrayList<TrackLevel> maps;

    public TrackStory(Localization.STORIES.THE_BEGINNING name)
    {
        this.name = name;
        this.maps = new ArrayList();
        stories.add(this);
    }

    public void add(TrackLevel map)
    {
        this.maps.add(map);
    }

    public String getName()
    {
        return this.name.translate(new String[0]);
    }

    public ArrayList<TrackLevel> getLevels()
    {
        return this.maps;
    }

    static
    {
        TrackLevel newday = TrackLevel.loadMap(new byte[] {(byte)0, (byte)9, (byte)65, (byte)32, (byte)110, (byte)101, (byte)119, (byte)32, (byte)100, (byte)97, (byte)121, (byte)1, (byte)103, (byte)54, (byte)33, (byte)0, (byte)16, (byte)33, (byte)0, (byte)16, (byte)34, (byte)0, (byte)16, (byte)35, (byte)0, (byte)16, (byte)36, (byte)0, (byte)16, (byte)37, (byte)0, (byte)64, (byte)38, (byte)0, (byte)32, (byte)70, (byte)0, (byte)16, (byte) - 125, (byte)0, (byte)16, (byte) - 124, (byte)0, (byte)16, (byte) - 123, (byte)0, (byte)80, (byte) - 122, (byte)0, (byte)32, (byte)102, (byte)0, (byte)16, (byte) - 126, (byte)0, (byte)48, (byte) - 127, (byte)0, (byte)32, (byte) - 95, (byte)0, (byte)16, (byte) - 30, (byte)0, (byte)16, (byte) - 29, (byte)0, (byte)16, (byte) - 28, (byte)0, (byte)16, (byte) - 27, (byte)0, (byte)16, (byte) - 26, (byte)0, (byte)96, (byte) - 31, (byte)0, (byte)32, (byte) - 63});
        newday.setName(Localization.STORIES.THE_BEGINNING.LEVEL_1);
        newday.addMessage(new LevelMessage(12, 1, 10, Localization.STORIES.THE_BEGINNING.MISSION));
        newday.addMessage((new LevelMessage(12, 4, 10, Localization.STORIES.THE_BEGINNING.START)).setMustNotBeRunning());
        newday.addMessage((new LevelMessage(12, 4, 10, Localization.STORIES.THE_BEGINNING.STOP)).setMustBeRunning());
        newday.addMessage((new LevelMessage(12, 7, 10, Localization.STORIES.THE_BEGINNING.MAP)).setMustBeDone());
        TrackLevel operator = TrackLevel.loadMap(new byte[] {(byte)0, (byte)12, (byte)84, (byte)104, (byte)101, (byte)32, (byte)79, (byte)112, (byte)101, (byte)114, (byte)97, (byte)116, (byte)111, (byte)114, (byte)1, (byte) - 95, (byte)118, (byte)99, (byte)0, (byte)16, (byte)99, (byte)0, (byte)16, (byte)100, (byte)0, (byte)16, (byte)101, (byte)0, (byte)16, (byte)102, (byte)1, (byte) - 64, (byte)103, (byte)0, (byte)16, (byte)104, (byte)0, (byte)16, (byte)105, (byte)0, (byte)16, (byte)106, (byte)0, (byte)16, (byte)107, (byte)0, (byte)16, (byte)108, (byte)0, (byte)16, (byte)109, (byte)0, (byte)16, (byte) - 56, (byte)0, (byte)16, (byte) - 55, (byte)0, (byte)96, (byte) - 57, (byte)0, (byte)32, (byte) - 121, (byte)0, (byte)32, (byte) - 89, (byte)0, (byte)16, (byte) - 54, (byte)0, (byte)16, (byte) - 53, (byte)0, (byte)16, (byte) - 52, (byte)0, (byte)16, (byte) - 51, (byte)0, (byte)80, (byte) - 50, (byte)0, (byte)32, (byte) - 114, (byte)0, (byte)32, (byte) - 82, (byte)0, (byte) - 96, (byte)110, (byte)0, (byte)32, (byte)46, (byte)0, (byte)32, (byte)78});
        operator.setName(Localization.STORIES.THE_BEGINNING.LEVEL_2);
        operator.addMessage(new LevelMessage(16, 1, 10, Localization.STORIES.THE_BEGINNING.TRACK_OPERATOR));
        operator.addMessage((new LevelMessage(16, 6, 10, Localization.STORIES.THE_BEGINNING.GOOD_JOB)).setMustBeDone());
        operator.addMessage((new LevelMessage(16, 6, 10, Localization.STORIES.THE_BEGINNING.CHANGE_JUNCTIONS)).setMustBeStill().setMustNotBeDone());
        TrackLevel loop = TrackLevel.loadMap(new byte[] {(byte)0, (byte)15, (byte)69, (byte)115, (byte)99, (byte)97, (byte)112, (byte)101, (byte)32, (byte)116, (byte)104, (byte)101, (byte)32, (byte)108, (byte)111, (byte)111, (byte)112, (byte)3, (byte) - 120, (byte)76, (byte) - 108, (byte)0, (byte)16, (byte) - 112, (byte)0, (byte)16, (byte) - 111, (byte)0, (byte)16, (byte) - 110, (byte)0, (byte)16, (byte) - 109, (byte)0, (byte)16, (byte) - 108, (byte)0, (byte)16, (byte) - 107, (byte)0, (byte)16, (byte) - 106, (byte)0, (byte)0, (byte) - 113, (byte)0, (byte)16, (byte) - 114, (byte)1, (byte)32, (byte) - 115, (byte)0, (byte)32, (byte) - 83, (byte)0, (byte)32, (byte) - 51, (byte)0, (byte) - 48, (byte) - 19, (byte)0, (byte)16, (byte) - 18, (byte)0, (byte)80, (byte) - 17, (byte)0, (byte)32, (byte) - 81, (byte)0, (byte)32, (byte) - 49, (byte)0, (byte)16, (byte) - 22, (byte)0, (byte)16, (byte) - 21, (byte)0, (byte)16, (byte) - 20, (byte)0, (byte)32, (byte)77, (byte)0, (byte)32, (byte)109, (byte)0, (byte)112, (byte)45, (byte)0, (byte)16, (byte)46, (byte)0, (byte)64, (byte)47, (byte)0, (byte)32, (byte)79, (byte)0, (byte)32, (byte)111, (byte)0, (byte)16, (byte)42, (byte)0, (byte)16, (byte)43, (byte)0, (byte)16, (byte)44, (byte)1, (byte)48, (byte)41, (byte)0, (byte)16, (byte)37, (byte)0, (byte)16, (byte)38, (byte)0, (byte)16, (byte)39, (byte)0, (byte)16, (byte)40, (byte)0, (byte)48, (byte)36, (byte)0, (byte)32, (byte)68, (byte)0, (byte)32, (byte)100, (byte)0, (byte)32, (byte)73, (byte)0, (byte)32, (byte)105, (byte)1, (byte)16, (byte) - 119, (byte)0, (byte)32, (byte) - 87, (byte)1, (byte) - 128, (byte) - 55, (byte)0, (byte) - 128, (byte) - 23, (byte)0, (byte)33, (byte)9, (byte)1, (byte)32, (byte) - 124, (byte)0, (byte)16, (byte) - 123, (byte)0, (byte)16, (byte) - 122, (byte)0, (byte)16, (byte) - 121, (byte)0, (byte)16, (byte) - 120, (byte)0, (byte)16, (byte) - 59, (byte)0, (byte)16, (byte) - 58, (byte)0, (byte)16, (byte) - 57, (byte)0, (byte)16, (byte) - 56, (byte)0, (byte)96, (byte) - 60, (byte)0, (byte)32, (byte) - 92});
        loop.setName(Localization.STORIES.THE_BEGINNING.LEVEL_3);
        loop.addMessage(new LevelMessage(17, 6, 9, Localization.STORIES.THE_BEGINNING.BLAST));
        TrackLevel steel = TrackLevel.loadMap(new byte[] {(byte)0, (byte)13, (byte)72, (byte)97, (byte)114, (byte)100, (byte)32, (byte)97, (byte)115, (byte)32, (byte)115, (byte)116, (byte)101, (byte)101, (byte)108, (byte)4, (byte) - 11, (byte)90, (byte)56, (byte)0, (byte)32, (byte)56, (byte)0, (byte)32, (byte)88, (byte)0, (byte)32, (byte)120, (byte)0, (byte)32, (byte) - 104, (byte)0, (byte)80, (byte) - 72, (byte)0, (byte)16, (byte) - 73, (byte)0, (byte)16, (byte) - 85, (byte)0, (byte) - 128, (byte) - 74, (byte)0, (byte)32, (byte) - 42, (byte)0, (byte)32, (byte) - 10, (byte)0, (byte)32, (byte) - 106, (byte)0, (byte)32, (byte)118, (byte)0, (byte)64, (byte)86, (byte)0, (byte)16, (byte) - 84, (byte)0, (byte)80, (byte) - 83, (byte)0, (byte)32, (byte) - 115, (byte)0, (byte)32, (byte)109, (byte)1, (byte)64, (byte)77, (byte)0, (byte)16, (byte)80, (byte)0, (byte)16, (byte)79, (byte)0, (byte)16, (byte)78, (byte)0, (byte) - 80, (byte)81, (byte)0, (byte)32, (byte)113, (byte)0, (byte)81, (byte)22, (byte)0, (byte)17, (byte)21, (byte)0, (byte)17, (byte)20, (byte)0, (byte) - 32, (byte) - 47, (byte)0, (byte)32, (byte) - 15, (byte)1, (byte)97, (byte)17, (byte)0, (byte)17, (byte)18, (byte)0, (byte)17, (byte)19, (byte)0, (byte)17, (byte)16, (byte)0, (byte)17, (byte)14, (byte)0, (byte)16, (byte) - 48, (byte)0, (byte)32, (byte) - 79, (byte)0, (byte)16, (byte) - 50, (byte)0, (byte)48, (byte) - 51, (byte)0, (byte)32, (byte) - 19, (byte)0, (byte)48, (byte) - 113, (byte)0, (byte)32, (byte) - 81, (byte)0, (byte)16, (byte) - 112, (byte)0, (byte)0, (byte) - 111, (byte)1, (byte)81, (byte)13, (byte)0, (byte) - 111, (byte)15, (byte)0, (byte)0, (byte) - 49, (byte)0, (byte)32, (byte) - 17, (byte)0, (byte)17, (byte)12, (byte)0, (byte)17, (byte)11, (byte)0, (byte)17, (byte)10, (byte)0, (byte)16, (byte)76, (byte)0, (byte)16, (byte)75, (byte)0, (byte)16, (byte)74, (byte)0, (byte)16, (byte)73, (byte)1, (byte) - 80, (byte)72, (byte)0, (byte)16, (byte)71, (byte)0, (byte) - 60, (byte) - 90, (byte)0, (byte)36, (byte) - 58, (byte)0, (byte)36, (byte) - 26, (byte)0, (byte)36, (byte) - 122, (byte)0, (byte)36, (byte)102, (byte)0, (byte)36, (byte) - 56, (byte)0, (byte)20, (byte) - 89, (byte)0, (byte)36, (byte) - 24, (byte)1, (byte) - 27, (byte)8, (byte)0, (byte)21, (byte)7, (byte)0, (byte)101, (byte)6, (byte)0, (byte)21, (byte)9, (byte)0, (byte) - 28, (byte) - 88, (byte)0, (byte)36, (byte) - 120, (byte)0, (byte)36, (byte)104, (byte)0, (byte)52, (byte)70, (byte)1, (byte) - 76, (byte)83, (byte)0, (byte) - 44, (byte) - 109, (byte)0, (byte)20, (byte)85, (byte)0, (byte)20, (byte)84, (byte)0, (byte)20, (byte)82, (byte)0, (byte)20, (byte) - 110, (byte)0, (byte)20, (byte) - 108, (byte)0, (byte)36, (byte)115});
        steel.setName(Localization.STORIES.THE_BEGINNING.LEVEL_4);
        steel.addMessage(new LevelMessage(0, 1, 5, Localization.STORIES.THE_BEGINNING.STEEL));
        TrackLevel moving = TrackLevel.loadMap(new byte[] {(byte)0, (byte)12, (byte)77, (byte)111, (byte)118, (byte)105, (byte)110, (byte)103, (byte)32, (byte)119, (byte)111, (byte)114, (byte)108, (byte)100, (byte)3, (byte)53, (byte)110, (byte) - 89, (byte)0, (byte)16, (byte) - 89, (byte)0, (byte)36, (byte)107, (byte)0, (byte)36, (byte) - 117, (byte)0, (byte)84, (byte) - 85, (byte)0, (byte)20, (byte)74, (byte)0, (byte)20, (byte)76, (byte)0, (byte)16, (byte)71, (byte)8, (byte)34, (byte) - 123, (byte)75, (byte)0, (byte)0, (byte)96, (byte) - 91, (byte)0, (byte)16, (byte) - 90, (byte)0, (byte)32, (byte)101, (byte)0, (byte)48, (byte)69, (byte)0, (byte)16, (byte)70, (byte)0, (byte)16, (byte)79, (byte)1, (byte)64, (byte)80, (byte)0, (byte)32, (byte)112, (byte)0, (byte)16, (byte)81, (byte)1, (byte)52, (byte)77, (byte)0, (byte)20, (byte)78, (byte)0, (byte)36, (byte)109, (byte)0, (byte)32, (byte) - 115, (byte)0, (byte)32, (byte) - 83, (byte)1, (byte)64, (byte)82, (byte)1, (byte)64, (byte)84, (byte)0, (byte)32, (byte)114, (byte)0, (byte)32, (byte)116, (byte)0, (byte)16, (byte)83, (byte)0, (byte)64, (byte)86, (byte)0, (byte)16, (byte)85, (byte)1, (byte)96, (byte) - 76, (byte)1, (byte)96, (byte) - 78, (byte)0, (byte)96, (byte) - 80, (byte)0, (byte)16, (byte) - 79, (byte)0, (byte)16, (byte) - 77, (byte)0, (byte)16, (byte) - 75, (byte)0, (byte)80, (byte) - 74, (byte)0, (byte) - 12, (byte) - 106, (byte)1, (byte) - 92, (byte)118, (byte)0, (byte)20, (byte)119, (byte)0, (byte)20, (byte) - 105, (byte)16, (byte)34, (byte) - 112, (byte)118, (byte) - 96, (byte)44, (byte)1, (byte)16, (byte)34, (byte) - 110, (byte)82, (byte) - 20, (byte) - 96, (byte)2, (byte)12, (byte)34, (byte) - 108, (byte) - 106, (byte) - 102, (byte)0, (byte)0, (byte) - 76, (byte)75, (byte)1, (byte)100, (byte) - 88, (byte)0, (byte)20, (byte) - 87, (byte)0, (byte)20, (byte) - 86, (byte)0, (byte)20, (byte)73, (byte)0, (byte)36, (byte) - 120, (byte)0, (byte)36, (byte)104, (byte)1, (byte)68, (byte)72});
        moving.setName(Localization.STORIES.THE_BEGINNING.LEVEL_5);
        moving.addMessage(new LevelMessage(1, 7, 25, Localization.STORIES.THE_BEGINNING.DETECTOR));
        TrackLevel lock = TrackLevel.loadMap(new byte[] {(byte)0, (byte)13, (byte)84, (byte)104, (byte)101, (byte)32, (byte)99, (byte)111, (byte)100, (byte)101, (byte)32, (byte)108, (byte)111, (byte)99, (byte)107, (byte)6, (byte) - 72, (byte) - 97, (byte)32, (byte)0, (byte)17, (byte)32, (byte)0, (byte)17, (byte)33, (byte)0, (byte)17, (byte)34, (byte)0, (byte)17, (byte)42, (byte)0, (byte)17, (byte)43, (byte)0, (byte)17, (byte)40, (byte)0, (byte)17, (byte)39, (byte)0, (byte)17, (byte)37, (byte)0, (byte)17, (byte)36, (byte)0, (byte) - 111, (byte)35, (byte)0, (byte) - 111, (byte)38, (byte)0, (byte) - 111, (byte)41, (byte)0, (byte)17, (byte)45, (byte)1, (byte) - 43, (byte)46, (byte)1, (byte) - 43, (byte)47, (byte)1, (byte) - 43, (byte)48, (byte)0, (byte)21, (byte)49, (byte)0, (byte)21, (byte)50, (byte)0, (byte)85, (byte)51, (byte)0, (byte)37, (byte)19, (byte)0, (byte)33, (byte)3, (byte)0, (byte)32, (byte) - 29, (byte)0, (byte)33, (byte)6, (byte)0, (byte)32, (byte) - 26, (byte)0, (byte)33, (byte)9, (byte)0, (byte)32, (byte) - 23, (byte)8, (byte)34, (byte) - 61, (byte)46, (byte)1, (byte)0, (byte)16, (byte) - 92, (byte)0, (byte)16, (byte) - 91, (byte)12, (byte)2, (byte) - 90, (byte)47, (byte)97, (byte)2, (byte)0, (byte)32, (byte) - 58, (byte)0, (byte)32, (byte) - 122, (byte)0, (byte)112, (byte) - 93, (byte)0, (byte)16, (byte) - 94, (byte)0, (byte)96, (byte) - 95, (byte)0, (byte)32, (byte) - 127, (byte)0, (byte)16, (byte) - 89, (byte)0, (byte)16, (byte) - 88, (byte)1, (byte)16, (byte) - 87, (byte)0, (byte)32, (byte) - 55, (byte)0, (byte)32, (byte) - 119, (byte)0, (byte)48, (byte)105, (byte)0, (byte)16, (byte)106, (byte)0, (byte)16, (byte)107, (byte)0, (byte)16, (byte)109, (byte)0, (byte)37, (byte)14, (byte)0, (byte)37, (byte)15, (byte)0, (byte)37, (byte)16, (byte)0, (byte)48, (byte)65, (byte)0, (byte)32, (byte)97, (byte)0, (byte)16, (byte)66, (byte)0, (byte)48, (byte)35, (byte)0, (byte)96, (byte)99, (byte)0, (byte)16, (byte)100, (byte)0, (byte)16, (byte)68, (byte)0, (byte)16, (byte)36, (byte)0, (byte)16, (byte)101, (byte)0, (byte)64, (byte)102, (byte)12, (byte)2, (byte)67, (byte)46, (byte)95, (byte)2, (byte)1, (byte)96, (byte)69, (byte)0, (byte)64, (byte)37, (byte)0, (byte)16, (byte)70, (byte)0, (byte)16, (byte)71, (byte)1, (byte)80, (byte)108, (byte)0, (byte)0, (byte)76, (byte)0, (byte)48, (byte)44, (byte)0, (byte)16, (byte)45, (byte)0, (byte)16, (byte)46, (byte)0, (byte)16, (byte)75, (byte)1, (byte)96, (byte)74, (byte)1, (byte)80, (byte)72, (byte)0, (byte)32, (byte)40, (byte)0, (byte)48, (byte)8, (byte)0, (byte)16, (byte)9, (byte)0, (byte)64, (byte)10, (byte)0, (byte)32, (byte)42, (byte)8, (byte)18, (byte)73, (byte)48, (byte)1, (byte)0, (byte)16, (byte)111, (byte)0, (byte)0, (byte)110, (byte)0, (byte)16, (byte)77, (byte)0, (byte)64, (byte)78, (byte)0, (byte) - 96, (byte)112, (byte)16, (byte)98, (byte) - 82, (byte)46, (byte)95, (byte) - 62, (byte)4, (byte)0, (byte)16, (byte) - 81, (byte)0, (byte)112, (byte)48, (byte)8, (byte)18, (byte)47, (byte)46, (byte)1, (byte)0, (byte)32, (byte)80, (byte)0, (byte)16, (byte)49, (byte)0, (byte)16, (byte)50, (byte)0, (byte) - 112, (byte) - 80, (byte)0, (byte)64, (byte)51, (byte)0, (byte)80, (byte) - 77, (byte)0, (byte)16, (byte) - 78, (byte)0, (byte)16, (byte) - 79, (byte)0, (byte)32, (byte)83, (byte)0, (byte)32, (byte) - 109, (byte)0, (byte)32, (byte)115, (byte)9, (byte)2, (byte) - 112, (byte)48, (byte)1, (byte)0, (byte)16, (byte) - 113, (byte)0, (byte)0, (byte) - 114, (byte)0, (byte)16, (byte) - 115, (byte)0, (byte)48, (byte) - 116, (byte)0, (byte)32, (byte) - 84, (byte)0, (byte)32, (byte) - 52, (byte)0, (byte)32, (byte) - 20, (byte)0, (byte)33, (byte)12, (byte)1, (byte)97, (byte)44});
        lock.setName(Localization.STORIES.THE_BEGINNING.LEVEL_6);
        TrackLevel close = TrackLevel.loadMap(new byte[] {(byte)0, (byte)8, (byte)83, (byte)111, (byte)32, (byte)99, (byte)108, (byte)111, (byte)115, (byte)101, (byte)6, (byte) - 94, (byte)38, (byte)71, (byte)0, (byte)16, (byte)68, (byte)0, (byte)16, (byte)70, (byte)0, (byte)16, (byte)71, (byte)0, (byte)16, (byte)72, (byte)0, (byte)16, (byte)7, (byte)0, (byte)16, (byte)8, (byte)1, (byte) - 28, (byte) - 91, (byte)0, (byte)20, (byte) - 92, (byte)0, (byte)100, (byte) - 93, (byte)0, (byte)16, (byte)66, (byte)0, (byte)16, (byte)65, (byte)0, (byte)16, (byte)64, (byte)0, (byte)20, (byte) - 90, (byte)0, (byte)36, (byte) - 123, (byte)0, (byte)36, (byte) - 125, (byte)0, (byte)64, (byte)9, (byte)0, (byte)32, (byte)41, (byte)0, (byte)80, (byte)73, (byte)0, (byte)16, (byte) - 89, (byte)1, (byte)64, (byte) - 88, (byte)1, (byte)80, (byte) - 87, (byte)0, (byte)96, (byte) - 56, (byte)0, (byte)48, (byte) - 119, (byte)0, (byte)16, (byte) - 55, (byte)12, (byte)18, (byte) - 118, (byte) - 91, (byte)80, (byte)1, (byte)8, (byte)18, (byte) - 86, (byte) - 51, (byte)0, (byte)12, (byte)18, (byte) - 54, (byte) - 91, (byte)90, (byte)0, (byte)0, (byte)16, (byte) - 53, (byte)0, (byte)16, (byte) - 85, (byte)0, (byte)16, (byte) - 117, (byte)0, (byte) - 32, (byte) - 51, (byte)0, (byte)0, (byte) - 83, (byte)0, (byte) - 96, (byte) - 115, (byte)0, (byte)16, (byte) - 116, (byte)0, (byte)16, (byte) - 84, (byte)0, (byte)16, (byte) - 52, (byte)0, (byte)32, (byte)109, (byte)0, (byte)32, (byte) - 19, (byte)0, (byte)16, (byte) - 82, (byte)0, (byte)17, (byte)12, (byte)0, (byte)17, (byte)11, (byte)0, (byte)17, (byte)10, (byte)0, (byte)17, (byte)9, (byte)0, (byte)17, (byte)8, (byte)0, (byte)17, (byte)7, (byte)0, (byte)17, (byte)6, (byte)0, (byte) - 111, (byte)13, (byte)0, (byte)17, (byte)14, (byte)0, (byte) - 76, (byte)45, (byte)0, (byte)36, (byte)77, (byte)0, (byte)20, (byte)44, (byte)0, (byte)20, (byte)46, (byte)0, (byte)16, (byte)47, (byte)8, (byte)18, (byte)48, (byte) - 51, (byte)0, (byte)0, (byte)16, (byte) - 81, (byte)0, (byte)16, (byte) - 80, (byte)0, (byte) - 96, (byte) - 78, (byte)0, (byte)16, (byte)49, (byte)0, (byte)16, (byte) - 79, (byte)0, (byte)16, (byte)115, (byte)0, (byte)32, (byte) - 108, (byte)0, (byte)32, (byte) - 76, (byte)0, (byte)32, (byte) - 12, (byte)0, (byte)17, (byte)19, (byte)0, (byte)17, (byte)18, (byte)8, (byte)2, (byte) - 44, (byte) - 91, (byte)0, (byte)0, (byte)96, (byte) - 46, (byte)0, (byte)16, (byte) - 45, (byte)0, (byte)17, (byte)17, (byte)0, (byte)17, (byte)15, (byte)8, (byte)19, (byte)16, (byte)5, (byte)0, (byte)0, (byte)97, (byte)1, (byte)0, (byte)48, (byte) - 63, (byte)0, (byte)16, (byte) - 62, (byte)0, (byte)64, (byte) - 61, (byte)0, (byte)32, (byte) - 29, (byte)1, (byte)97, (byte)3, (byte)0, (byte)17, (byte)4, (byte)0, (byte)17, (byte)5, (byte)0, (byte)17, (byte)2, (byte)12, (byte)34, (byte) - 31, (byte)5, (byte) - 102, (byte)1, (byte)0, (byte)16, (byte) - 43, (byte)0, (byte) - 96, (byte) - 42, (byte)0, (byte)32, (byte) - 74, (byte)0, (byte)32, (byte) - 106, (byte)0, (byte)64, (byte)118, (byte)0, (byte)16, (byte)117, (byte)0, (byte)112, (byte)116, (byte)1, (byte)81, (byte)20, (byte)0, (byte)17, (byte)21, (byte)0, (byte)81, (byte)22, (byte)0, (byte)32, (byte) - 10, (byte)1, (byte)68, (byte)5, (byte)0, (byte)20, (byte)6, (byte)0, (byte)20, (byte)4, (byte)0, (byte)36, (byte)37, (byte)0, (byte)36, (byte)99, (byte)0, (byte)36, (byte)35, (byte)0, (byte)36, (byte)101, (byte)0, (byte)4, (byte)69, (byte)0, (byte)4, (byte)67, (byte)0, (byte)52, (byte)3, (byte)8, (byte)34, (byte) - 110, (byte)5, (byte)0, (byte)1, (byte)116, (byte)114, (byte)0, (byte)36, (byte)82, (byte)0, (byte)68, (byte)50});
        close.setName(Localization.STORIES.THE_BEGINNING.LEVEL_7);
        close.addMessage((new LevelMessage(20, 0, 7, Localization.STORIES.THE_BEGINNING.OUT_OF_REACH)).setMustNotBeDone());
        close.addMessage((new LevelMessage(20, 0, 7, Localization.STORIES.THE_BEGINNING.OUT_OF_REACH_2)).setMustBeDone());
        TrackLevel madness = TrackLevel.loadMap(new byte[] {(byte)0, (byte)7, (byte)77, (byte)97, (byte)100, (byte)110, (byte)101, (byte)115, (byte)115, (byte)16, (byte) - 32, (byte)30, (byte)99, (byte)0, (byte)32, (byte)32, (byte)0, (byte)32, (byte)64, (byte)0, (byte)32, (byte)96, (byte)0, (byte)48, (byte)0, (byte)0, (byte)32, (byte) - 128, (byte)0, (byte)32, (byte) - 96, (byte)0, (byte)32, (byte) - 32, (byte)0, (byte)32, (byte) - 64, (byte)0, (byte)33, (byte)0, (byte)0, (byte)97, (byte)32, (byte)1, (byte) - 47, (byte)33, (byte)0, (byte)81, (byte)34, (byte)0, (byte)49, (byte)1, (byte)12, (byte)3, (byte)2, (byte)43, (byte) - 109, (byte)1, (byte)0, (byte)112, (byte) - 30, (byte)0, (byte)96, (byte) - 31, (byte)0, (byte)32, (byte) - 63, (byte)0, (byte)16, (byte)1, (byte)0, (byte)64, (byte)2, (byte)0, (byte)32, (byte)66, (byte)1, (byte)16, (byte)34, (byte)0, (byte)48, (byte)33, (byte)0, (byte)32, (byte)65, (byte)0, (byte)32, (byte)97, (byte)0, (byte) - 95, (byte)3, (byte)0, (byte)64, (byte) - 29, (byte)0, (byte)32, (byte) - 127, (byte)8, (byte)34, (byte) - 95, (byte)34, (byte)0, (byte)0, (byte)97, (byte)35, (byte)0, (byte)81, (byte)37, (byte)0, (byte)97, (byte)4, (byte)0, (byte)32, (byte) - 28, (byte)0, (byte)64, (byte) - 60, (byte)0, (byte)16, (byte) - 61, (byte)0, (byte)96, (byte) - 62, (byte)12, (byte)19, (byte)36, (byte)44, (byte)21, (byte)2, (byte)0, (byte)65, (byte)6, (byte)0, (byte)36, (byte) - 94, (byte)0, (byte)36, (byte)98, (byte)1, (byte)36, (byte) - 126, (byte)0, (byte)68, (byte) - 125, (byte)0, (byte)96, (byte) - 93, (byte)0, (byte)80, (byte) - 92, (byte)0, (byte)32, (byte) - 124, (byte)0, (byte)64, (byte)100, (byte)0, (byte)16, (byte)99, (byte)1, (byte)49, (byte)5, (byte)0, (byte)97, (byte)38, (byte)0, (byte)17, (byte)39, (byte)0, (byte)17, (byte)40, (byte)0, (byte)81, (byte)41, (byte)0, (byte) - 79, (byte)9, (byte)0, (byte)97, (byte)7, (byte)8, (byte)19, (byte)8, (byte)69, (byte)0, (byte)0, (byte) - 95, (byte)10, (byte)0, (byte)64, (byte) - 22, (byte)0, (byte)97, (byte)42, (byte)0, (byte)16, (byte) - 23, (byte)0, (byte)0, (byte) - 25, (byte)0, (byte)16, (byte) - 24, (byte)0, (byte)16, (byte) - 26, (byte)0, (byte)96, (byte) - 27, (byte)1, (byte) - 59, (byte)43, (byte)1, (byte)69, (byte)44, (byte)0, (byte)21, (byte)45, (byte)1, (byte)85, (byte)46, (byte)0, (byte)4, (byte) - 18, (byte)0, (byte)21, (byte)47, (byte)0, (byte)85, (byte)48, (byte)0, (byte)4, (byte) - 16, (byte)0, (byte)48, (byte) - 82, (byte)0, (byte)64, (byte) - 80, (byte)8, (byte)18, (byte) - 81, (byte) - 49, (byte)0, (byte)0, (byte)48, (byte) - 59, (byte)0, (byte)16, (byte) - 58, (byte)0, (byte)0, (byte) - 57, (byte)0, (byte)16, (byte) - 90, (byte)0, (byte)96, (byte) - 91, (byte)0, (byte)32, (byte) - 123, (byte)0, (byte)36, (byte)3, (byte)0, (byte)100, (byte)67, (byte)0, (byte)36, (byte)101, (byte)0, (byte)20, (byte)68, (byte)0, (byte) - 76, (byte)69, (byte)0, (byte)5, (byte)14, (byte)0, (byte)5, (byte)16, (byte)0, (byte)4, (byte) - 50, (byte)0, (byte)4, (byte) - 48, (byte)1, (byte)68, (byte) - 49, (byte)0, (byte)16, (byte) - 52, (byte)0, (byte)16, (byte) - 51, (byte)1, (byte)80, (byte) - 53, (byte)0, (byte)16, (byte) - 47, (byte)0, (byte)16, (byte) - 46, (byte)0, (byte)64, (byte) - 45, (byte)0, (byte) - 112, (byte) - 17, (byte)0, (byte)17, (byte)15, (byte)0, (byte)16, (byte) - 19, (byte)0, (byte)16, (byte) - 20, (byte)0, (byte)48, (byte) - 21, (byte)0, (byte)97, (byte)11, (byte)8, (byte)19, (byte)12, (byte)116, (byte)0, (byte)0, (byte)17, (byte)13, (byte)0, (byte)17, (byte)17, (byte)0, (byte)16, (byte) - 15, (byte)0, (byte)16, (byte) - 14, (byte)0, (byte)17, (byte)18, (byte)0, (byte)0, (byte) - 13, (byte)0, (byte)1, (byte)19, (byte)0, (byte)81, (byte)51, (byte)0, (byte)17, (byte)50, (byte)0, (byte)49, (byte)49, (byte)1, (byte)64, (byte) - 89, (byte)0, (byte)84, (byte)70, (byte)0, (byte)36, (byte)38, (byte)0, (byte)68, (byte)6, (byte)0, (byte)52, (byte)4, (byte)0, (byte)84, (byte)37, (byte)0, (byte)4, (byte)5, (byte)0, (byte)20, (byte) - 56, (byte)0, (byte)20, (byte) - 54, (byte)1, (byte)84, (byte) - 55, (byte)0, (byte)4, (byte) - 87, (byte)0, (byte)20, (byte) - 88, (byte)0, (byte)20, (byte) - 86, (byte)1, (byte)16, (byte) - 85, (byte)0, (byte) - 128, (byte) - 117, (byte)0, (byte)64, (byte) - 116, (byte)0, (byte)64, (byte)107, (byte)0, (byte)48, (byte) - 119, (byte)0, (byte)80, (byte) - 118, (byte)1, (byte) - 64, (byte)106, (byte)0, (byte)16, (byte)105, (byte)0, (byte)48, (byte)102, (byte)1, (byte)48, (byte)104, (byte)0, (byte)16, (byte)103, (byte)0, (byte)96, (byte) - 122, (byte)0, (byte)80, (byte) - 120, (byte)12, (byte)18, (byte) - 121, (byte)69, (byte)22, (byte)1, (byte)0, (byte)100, (byte) - 84, (byte)0, (byte)84, (byte) - 83, (byte)0, (byte) - 12, (byte) - 115, (byte)0, (byte)20, (byte) - 114, (byte)8, (byte)34, (byte)39, (byte) - 115, (byte)0, (byte)0, (byte)48, (byte)7, (byte)0, (byte)16, (byte)8, (byte)0, (byte)96, (byte)71, (byte)1, (byte)96, (byte)41, (byte)0, (byte)48, (byte)40, (byte)1, (byte)80, (byte)72, (byte)0, (byte)16, (byte)73, (byte)0, (byte)16, (byte)74, (byte)0, (byte)16, (byte)75, (byte)0, (byte)4, (byte)109, (byte)0, (byte)4, (byte)13, (byte)0, (byte)4, (byte)45, (byte)0, (byte)20, (byte)14, (byte)0, (byte)20, (byte)46, (byte)0, (byte)64, (byte)9, (byte)0, (byte)48, (byte)10, (byte)1, (byte)80, (byte)42, (byte)0, (byte)16, (byte)44, (byte)0, (byte)16, (byte)12, (byte)0, (byte)16, (byte)11, (byte)0, (byte)52, (byte)78, (byte)0, (byte)68, (byte)79, (byte)0, (byte)4, (byte)111, (byte)1, (byte)84, (byte) - 113, (byte)0, (byte)16, (byte) - 112, (byte)12, (byte)18, (byte)112, (byte)48, (byte) - 94, (byte)0, (byte)0, (byte)96, (byte) - 79, (byte)0, (byte) - 32, (byte) - 111, (byte)1, (byte)20, (byte)77, (byte)0, (byte)116, (byte)76, (byte)0, (byte)100, (byte)108, (byte)0, (byte)0, (byte)113, (byte)0, (byte)64, (byte)114, (byte)0, (byte)32, (byte) - 110, (byte)0, (byte)80, (byte) - 78, (byte)0, (byte) - 12, (byte)35, (byte)1, (byte)100, (byte)36, (byte)8, (byte)18, (byte)43, (byte)35, (byte)0, (byte)1, (byte)52, (byte)48, (byte)1, (byte) - 124, (byte)81, (byte)0, (byte)100, (byte)80, (byte)1, (byte) - 48, (byte)110, (byte)0, (byte)20, (byte)15, (byte)0, (byte) - 28, (byte)49, (byte)0, (byte)20, (byte)47, (byte)1, (byte) - 80, (byte)17, (byte)0, (byte)20, (byte)16, (byte)0, (byte)64, (byte)18, (byte)0, (byte)32, (byte)50, (byte)0, (byte)96, (byte)82, (byte)0, (byte)64, (byte)83, (byte)0, (byte)32, (byte)115, (byte)8, (byte)34, (byte) - 109, (byte)69, (byte)0, (byte)0, (byte)96, (byte) - 77, (byte)0, (byte)48, (byte)19, (byte)0, (byte)96, (byte)51, (byte)0, (byte)64, (byte)52, (byte)1, (byte) - 92, (byte)84, (byte)1, (byte) - 92, (byte)116, (byte)1, (byte) - 92, (byte) - 108, (byte)1, (byte)16, (byte)85, (byte)1, (byte)16, (byte)117, (byte)0, (byte)32, (byte)53, (byte)0, (byte)0, (byte)21, (byte)1, (byte)16, (byte) - 107, (byte)0, (byte)80, (byte) - 75, (byte)1, (byte)84, (byte) - 76, (byte)0, (byte) - 32, (byte) - 12, (byte)0, (byte)48, (byte) - 44, (byte)1, (byte)1, (byte)20, (byte)0, (byte)97, (byte)52, (byte)0, (byte)17, (byte)53, (byte)0, (byte)17, (byte)54, (byte)12, (byte)18, (byte) - 43, (byte) - 108, (byte) - 88, (byte)0, (byte)0, (byte)81, (byte)55, (byte)0, (byte)97, (byte)56, (byte)0, (byte)113, (byte)23, (byte)0, (byte) - 95, (byte)24, (byte)16, (byte)19, (byte)57, (byte)116, (byte)40, (byte)81, (byte)1, (byte)0, (byte)81, (byte)58, (byte)0, (byte)65, (byte)26, (byte)0, (byte)97, (byte)25, (byte)0, (byte)48, (byte) - 11, (byte)0, (byte)97, (byte)21, (byte)12, (byte)19, (byte)22, (byte)116, (byte) - 88, (byte)0, (byte)0, (byte)112, (byte) - 7, (byte)1, (byte)64, (byte) - 8, (byte)0, (byte) - 112, (byte) - 9, (byte)0, (byte)16, (byte) - 10, (byte)0, (byte)80, (byte) - 6, (byte)8, (byte)18, (byte)20, (byte)84, (byte)0, (byte)0, (byte)64, (byte) - 41, (byte)0, (byte) - 112, (byte) - 42, (byte)0, (byte)48, (byte) - 74, (byte)0, (byte)16, (byte) - 73, (byte)0, (byte)64, (byte) - 72, (byte)0, (byte)96, (byte) - 40, (byte)0, (byte)64, (byte) - 38, (byte)0, (byte) - 112, (byte) - 39, (byte)0, (byte)48, (byte) - 71, (byte)0, (byte)80, (byte) - 70, (byte)0, (byte)32, (byte) - 102, (byte)0, (byte)32, (byte)122, (byte)0, (byte)32, (byte)90, (byte)0, (byte)32, (byte)58, (byte)0, (byte)16, (byte)25, (byte)0, (byte)16, (byte)24, (byte)1, (byte)48, (byte)23, (byte)1, (byte)64, (byte)22, (byte)0, (byte)64, (byte)26, (byte)0, (byte)32, (byte)55, (byte)0, (byte)32, (byte)119, (byte)0, (byte)96, (byte) - 106, (byte)1, (byte)32, (byte)86, (byte)0, (byte)32, (byte)54, (byte)0, (byte)0, (byte)87, (byte)0, (byte) - 112, (byte) - 105, (byte)12, (byte)34, (byte)118, (byte)116, (byte)40, (byte)1, (byte)0, (byte)80, (byte) - 103, (byte)0, (byte)32, (byte)121, (byte)0, (byte)64, (byte)57, (byte)1, (byte)80, (byte) - 104, (byte)0, (byte)48, (byte)56, (byte)0, (byte) - 96, (byte)88, (byte)8, (byte)34, (byte)120, (byte) - 108, (byte)0, (byte)8, (byte)34, (byte)89, (byte)84, (byte)0});
        madness.setName(Localization.STORIES.THE_BEGINNING.LEVEL_8);
        TrackLevel cake = new TrackLevel(Localization.STORIES.THE_BEGINNING.LEVEL_9, 6, 4, TrackOrientation.DIRECTION.RIGHT, 20, 4);
        Track.addTrack(cake.getTracks(), 4, 4, 9, 4);
        cake.getTracks().add(new TrackEnderHandler(10, 4, TrackOrientation.STRAIGHT_HORIZONTAL, true));
        Track.addTrack(cake.getTracks(), 11, 4, 21, 4);
        cake.getTracks().add(new TrackEnderHandler(22, 4, TrackOrientation.STRAIGHT_HORIZONTAL, false));
        cake.addMessage(new LevelMessage(4, 1, 23, Localization.STORIES.THE_BEGINNING.LONG_JOURNEY));
        cake.addMessage((new LevelMessage(3, 6, 21, Localization.STORIES.THE_BEGINNING.END)).setMustBeStill());
        cake.addMessage((new LevelMessage(9, 9, 8, Localization.STORIES.THE_BEGINNING.THANKS)).setMustBeStill());
        TrackStory story0 = new TrackStory(Localization.STORIES.THE_BEGINNING.TITLE);
        story0.add(newday);
        story0.add(operator);
        story0.add(loop);
        story0.add(steel);
        story0.add(moving);
        story0.add(lock);
        story0.add(close);
        story0.add(madness);
        story0.add(cake);
    }
}