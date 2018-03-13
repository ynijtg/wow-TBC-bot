package wow.navigation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Player's X, Y and Z position return world coordinates of the character.
 * In order to get zone-specific coordinates (such as you get from Cartographer),
 * we need to know the size of the zone (or whatever these numbers are) and do some maths.
 * They can be extracted from WorldMapArea.dbc located in data/enGB/patch-2.mpq
 *
 * @author Cargeh
 */
public final class Zones {

    private final static Map<Integer, Zone> zones = new HashMap<>();

    static {
        Arrays.stream(Zone.values())
            .forEach(zone -> zones.put(zone.id, zone));
    }

    public static Zone getZone(int zoneId) {
        Zone zone = zones.get(zoneId);
        if (zone == null)
            throw new RuntimeException("Zone " + zoneId + " is not found.");
        return zone;
    }

    public enum Zone {
        D1(1, 2137.5, -2760.417, -3941.667, -7206.25),
        D3(3, -1902.083, -4972.917, -5854.167, -7900),
        D4(4, -1193.75, -4856.25, -10583.33, -13025),
        D8(8, -2081.25, -4589.583, -9535.416, -11208.33),
        D10(10, 833.3333, -1866.667, -9716.666, -11516.67),
        D11(11, -389.5833, -4525, -2147.917, -4904.167),
        D12(12, 1535.417, -1935.417, -7939.583, -10254.17),
        D14(14, -1962.5, -7250, 1808.333, -1716.667),
        //        D15(15, -975, -6225, -2033.334, -5533.334),
        D15(15, -975, -6225, -2033.334, -5533.334),
        D16(16, -3372.917, -8887.5, 5381.25, 1704.167),
        D17(17, 202.0833, -5543.75, 1810.417, -2020.833),
        D28(28, 416.6667, -3883.333, 3366.667, 500),
        D33(33, 1743.75, -2356.25, -11016.67, -13750),
        D38(38, -1993.75, -4752.083, -4487.5, -6327.083),
        D40(40, 3016.667, -483.3333, -9400, -11733.33),
        D41(41, -833.3333, -3333.333, -9866.666, -11533.33),
        D44(44, -1479.167, -4047.917, -8514.583, -10227.08),
        D45(45, -1127.083, -4604.167, -141.6667, -2460.417),
        D46(46, -464.5833, -3616.667, -6985.417, -9085.416),
        D47(47, -1575, -5425, 1466.667, -1100),
        D51(51, -322.9167, -2554.167, -6100, -7587.5),
        D65(65, 3627.083, -1981.25, 5575, 1835.417),
        D66(66, -600, -5593.75, 7668.75, 4339.583),
        D67(67, 1841.667, -5270.833, 10197.92, 5456.25),
        D85(85, 3033.333, -1485.417, 3837.5, 824.9999),
        D130(130, 3450, -750, 1666.667, -1133.333),
        D139(139, -2287.5, -6318.75, 3704.167, 1016.667),
        D141(141, 4235.417, -1639.583, 11847.92, 7931.25),
        D148(148, 3016.667, -3447.917, 8222.916, 3912.5),
        D209(209, 4500, 300, 1133.333, -1666.667),
        D210(210, 5443.75, -827.0833, 9427.083, 5245.833),
        D215(215, 2204.167, -3245.833, -168.75, -3802.083),
        D267(267, 1850, -3012.5, 1481.25, -1760.417),
        D331(331, 1700, -4066.667, 4672.917, 829.1666),
        D357(357, 5441.667, -1508.333, -2366.667, -7000),
        D361(361, 1797.917, -4264.583, 7237.5, 3195.833),
        D394(394, -1110.417, -6360.417, 5516.667, 2016.667),
        D400(400, -433.3333, -4833.333, -3966.667, -6900),
        D405(405, 4233.333, -262.5, 452.0833, -2545.833),
        D406(406, 3902.083, -1997.917, 3404.167, -529.1666),
        D440(440, -62.5, -7275, -5770.833, -10579.17),
        D490(490, 533.3333, -3166.667, -5966.667, -8433.333),
        D491(491, 2766.667, 966.6666, 2733.333, 1533.333),
        D493(493, -1381.25, -3689.583, 8491.666, 6952.083),
        D495(495, -1397.917, -7443.75, 3116.667, -914.5833),
        //        D616(616, -929.1666, -5175, 6195.833, 3364.583),
        D616(616, -929.1666, -5175, 6195.833, 3364.583),
        D618(618, -991.6666, -7141.667, 8793.75, 4693.75),
        D722(722, 2766.667, -633.3333, 3266.667, 999.9999),
        D796(796, 1508.333, -800, 1918.75, 379.166),
        D1176(1176, 1625, 241.6667, 2052.083, 1129.167),
        D1196(1196, 3275, -3275, 2166.667, -2200),
        D1377(1377, 2983.333, -1075, -5872.917, -8579.166),
        D1497(1497, 873.1926, -86.1824, 1877.945, 1237.841),
        D1519(1519, 1722.917, -14.58333, -7995.833, -9154.166),
        D1537(1537, -713.5914, -1504.216, -4569.241, -5096.846),
        D1581(1581, 1966.667, -3033.333, 1133.333, -2200),
        D1637(1637, -3506.354, -5245.729, 2486.667, 1327.083),
        D1638(1638, 516.6666, -527.0833, -849.9999, -1545.833),
        D1657(1657, 3187.5, 1647.917, 10464.58, 9437.5),
        //        D1977(1977, -693.75, -2570.833, -11308.33, -12560.42),
        D1977(1977, -612.5, -2733.333, -11225, -12639.58),
        D2017(2017, -1766.667, -5166.667, 4333.333, 2066.667),
        D2057(2057, 633.3333, -1166.667, 600, -600),
        D2366(2366, 7650, 6562.5, -1500, -2225),
        D2367(2367, 1854.167, -477.0833, 3127.083, 1572.917),
        D2597(2597, 1781.25, -2456.25, 1085.417, -1739.583),
        D2677(2677, 633.3333, -2766.667, -6333.333, -8600),
        D2817(2817, 1443.75, -1279.167, 6502.083, 4687.5),
        D3277(3277, 2041.667, 895.8333, 1627.083, 862.4999),
        D3358(3358, 1858.333, 102.0833, 1508.333, 337.5),
        D3428(3428, 3033.333, 1233.333, -7933.333, -9133.333),
        D3429(3429, 3035.417, 522.9166, -8233.333, -9908.333),
        D3430(3430, -4487.5, -9412.5, 11041.67, 7758.333),
        D3433(3433, -5283.333, -8583.333, 8266.666, 6066.667),
        D3456(3456, -2520.833, -4377.083, 3597.917, 2360.417),
        D3457(3457, -1191.667, -2950, -10389.58, -11562.5),
        D3483(3483, 5539.583, 375, 1481.25, -1962.5),
        D3487(3487, -6400.75, -7612.208, 10153.71, 9346.938),
        D3518(3518, 10295.83, 4770.833, 41.66666, -3641.667),
        D3519(3519, 7083.333, 1683.333, -999.9999, -4600),
        D3520(3520, 4225, -1275, -1947.917, -5614.583),
        D3521(3521, 9475, 4447.917, 1935.417, -1416.667),
        D3522(3522, 8845.833, 3420.833, 4408.333, 791.6666),
        D3523(3523, 5483.333, -91.66666, 5456.25, 1739.583),
        D3524(3524, -10500, -14570.83, -2793.75, -5508.333),
        D3525(3525, -10075, -13337.5, -758.3333, -2933.333),
        D3537(3537, 8570.833, 2806.25, 4897.917, 1054.167),
        D3557(3557, -11066.37, -12123.14, -3609.683, -4314.371),
        D3562(3562, 1935.417, 1277.083, -1041.667, -1479.167),
        D3606(3606, -1525, -4025, 6145.833, 4479.167),
        D3703(3703, 6135.259, 4829.009, -1473.954, -2344.788),
        D3711(3711, 6929.167, 2572.917, 7287.5, 4383.333),
        D3805(3805, 1852.083, 583.3333, 568.75, -277.0833),
        D3820(3820, 2660.417, 389.5833, 2918.75, 1404.167),
        D3959(3959, 1150, 366.6667, 949.9999, 427.0833),
        D4075(4075, 1206.25, 300, 2012.5, 1408.333),
        D4080(4080, -5302.083, -8629.166, 13568.75, 11350),
        D4100(4100, 2152.083, 327.0833, 2297.917, 1081.25),
        D4131(4131, 250, -297.9167, 325, -39.58333),
        D4196(4196, -377.0833, -1004.167, -168.75, -587.5),
        D4197(4197, 4329.167, 1354.167, 5716.667, 3733.333),
        D4228(4228, 2337.5, -262.5, 1956.25, 222.9167),
        D4264(4264, 2766.667, -633.3333, 2200, -66.66666),
        D4272(4272, 2500, -899.9999, 2200, -66.66666),
        D4273(4273, 1583.333, -1704.167, 1168.75, -1022.917),
        D4277(4277, 1020.833, -52.08333, 872.9166, 158.3333),
        D4298(4298, -4047.917, -7210.417, 3087.5, 979.1666),
        D4384(4384, 787.5, -956.2499, 1883.333, 720.8333),
        D4415(4415, 983.3333, 600, 2006.25, 1750),
        D4416(4416, 1310.417, 166.6667, 2122.917, 1360.417),
        D4493(4493, 1133.333, -29.16667, 3616.667, 2841.667),
        D4494(4494, -233.3333, -1206.25, 849.9999, 202.0833),
        D4500(4500, 2766.667, -633.3333, 2200, -66.66666),
        D4603(4603, 1033.333, -1566.667, 600, -1133.333),
        D4706(4706, 3439.583, 293.75, -533.3333, -2631.25),
        D4709(4709, 1356.25, -6056.25, 204.1667, -4737.5),
        D4710(4710, 525, -2125, 1708.333, -58.33333),
        D4714(4714, 3439.583, 293.75, -533.3333, -2631.25),
        D4720(4720, 4383.333, -131.25, 2881.25, -129.1667),
        D4722(4722, 2100, -500, 2200, 466.6667),
        D4723(4723, 2100, -500, 2200, 466.6667),
        D4737(4737, 2129.167, 777.0833, -7731.25, -8631.25),
        D4742(4742, 2797.917, -879.1666, 10781.25, 8329.166),
        D4755(4755, 1933.333, 1043.75, -1306.25, -1900),
        D4809(4809, 7033.333, -4366.667, 6466.667, -1133.333),
        D4812(4812, 6366.667, -5833.333, 5933.333, -2200),
        D4813(4813, 839.5833, -693.75, 1256.25, 233.3333),
        D4815(4815, 5070.833, 2268.75, -4018.75, -5887.5),
        D4820(4820, 7033.333, -5966.667, 6466.667, -2200),
        D4922(4922, -2437.5, -7708.333, -2156.25, -5670.833),
        D4926(4926, 2100, -500, 1133.333, -600),
        D4945(4945, 2366.667, -1833.333, 600, -2200),
        D4950(4950, 1166.667, -2233.333, 600, -1666.667),
        D4987(4987, 902.0833, 150, 3429.167, 2927.083),
        D5004(5004, 2100, -500, 600, -1133.333),
        D5031(5031, 931.2499, -283.3333, 2266.667, 1456.25),
        D5034(5034, 2441.667, -3752.083, -8029.167, -12158.33),
        D5035(5035, 2366.667, -1833.333, 600, -2200),
        D5042(5042, 3052.083, -2047.917, 2795.833, -604.1666),
        D5088(5088, 2766.667, -633.3333, 2200, -66.66666),
        D5094(5094, 1033.333, -1566.667, 600, -1133.333),
        D5095(5095, 2010.417, -4.166667, -560.4166, -1904.167),
        D5108(5108, 1933.333, 1043.75, -1306.25, -1900),
        D5144(5144, 6681.25, 1831.25, -4756.25, -7989.583),
        D5145(5145, 8233.333, 4158.333, -4906.25, -7622.917),
        D5146(5146, 8754.166, 1808.333, -3720.833, -8352.083),
        D5287(5287, 2108.333, -1837.5, -12516.67, -15147.92),
        D5334(5334, 1166.667, -2233.333, 600, -1666.667),
        D5339(5339, 2977.083, -3575, -10964.58, -15333.33),
        D5351(5351, 1933.333, 1043.75, -1306.25, -1900),
        D5389(5389, 2412.5, 575, 377.0833, -847.9166),
        D5396(5396, -1004.167, -1975, -10591.67, -11239.58),
        D5416(5416, 1556.25, 6.25, 1370.833, 337.5),
        D5449(5449, 1745.833, 443.75, 1604.167, 735.4166),
        D5600(5600, 2633.333, 33.33333, 1133.333, -600),
        D5638(5638, 2100, -500, 600, -1133.333),
        D5695(5695, 3891.667, -158.3333, -8033.333, -10733.33),
        D5723(5723, 718.75, -868.7499, 425, -633.3333),
        D5733(5733, 933.3333, -256.25, 1702.083, 908.3333),
        D5736(5736, 4979.166, 2308.333, 1785.417, 6.25),
        D5785(5785, 1452.083, -5531.25, 3652.083, -1002.084),
        D5788(5788, -4650, -5902.083, 3766.667, 2933.333),
        D5789(5789, 2260.417, -1035.417, 4697.917, 2500),
        D5799(5799, 2660.417, 389.5833, 2918.75, 1404.167),
        D5805(5805, 2679.167, -1245.834, 1095.833, -1520.834),
        D5840(5840, 2481.25, -52.08398, 1947.917, 260.416),
        D5841(5841, 4839.583, -1418.75, 5618.75, 1445.833),
        D5842(5842, 7079.166, 1335.417, 4558.333, 729.167),
        D5844(5844, 1791.667, -1252.083, 5327.083, 3297.917),
        D5861(5861, 7268.75, 5410.417, -3322.917, -4562.5),
        D5892(5892, -833.5928, -3940.301, -565.0928, -2628.158),
        D5918(5918, 3362.5, 2300, 4210.417, 3502.083),
        D5956(5956, -2154.166, -2918.75, 1197.917, 687.5),
        D5963(5963, 1664.583, 814.583, -458.334, -1025),
        D5976(5976, 3133.333, 1333.333, 1666.667, 466.666),
        D6006(6006, 812.5, -981.25, 1689.583, 493.75),
        D6040(6040, -3979.166, -5037.5, -3468.75, -4175),
        D6051(6051, 1743.75, 904.167, 2083.333, 1522.917),
        D6052(6052, 977.083, 60.41602, 1372.917, 762.5),
        D6066(6066, 1597.917, -1708.334, 1612.5, -591.666),
        D6067(6067, -2497.916, -3200, -789.584, -1258.334),
        D6101(6101, -875, -1343.75, 2389.583, 2077.083),
        D6109(6109, 2233.333, -1166.666, 2200, -66.66602),
        D6125(6125, 2633.333, 33.33398, 4866.666, 3133.333),
        D6126(6126, 1320.833, -929.166, 1495.833, -4.166016),
        D6134(6134, 2947.917, -1739.584, -110.416, -3235.416),
        D6138(6138, 6139.583, 787.5, 1416.667, -2152.084),
        D6170(6170, 187.5, -781.25, -8570.832, -9216.666),
        D6176(6176, 979.167, 14.58398, -5962.5, -6606.25),
        D6182(6182, -700, -4100, -3133.334, -5400),
        D6208(6208, 3587.5, 1175, 1608.333, 0),
        D6209(6209, -1397.916, -2322.916, 2372.917, 1756.25),
        D6214(6214, 5762.5, 4747.916, 2029.167, 1352.083),
        D6219(6219, 902.083, 145.834, 4008.333, 3504.167),
        D6297(6297, 1279.167, -243.75, -1714.584, -2729.166),
        D6309(6309, 1220.833, 314.584, -2564.584, -3168.75),
        D6328(6328, 5616.666, 2933.333, -252.084, -2041.666),
        D6419(6419, 2102.083, 1372.917, 4168.75, 3683.333),
        D6426(6426, 747.917, -222.916, 2216.667, 1568.75),
        D6449(6449, 1743.75, 904.167, 2083.333, 1522.917),
        D6450(6450, 1491.667, 41.66602, 11033.33, 10066.67),
        D6451(6451, -3641.666, -4991.666, 0, -900),
        D6452(6452, 233.334, -1533.334, -2577.084, -3754.166),
        D6453(6453, -4491.666, -6297.916, -525, -1729.166),
        D6454(6454, 2147.917, 1058.333, 2270.833, 1543.75),
        D6455(6455, -5383.334, -6983.334, 10833.33, 9766.666),
        D6456(6456, -12814.58, -14633.33, -3604.166, -4816.666),
        D6457(6457, 1206.25, -643.75, -4727.084, -5960.416),
        D6500(6500, -3979.166, -5037.5, -3468.75, -4175);

        private int id;
        private double y;
        private double x;
        private double xDifference;
        private double yDifference;

        Zone(
            int id,
            double y1,
            double y2,
            double x1,
            double x2)
        {
            this.id = id;
            this.y = y1;
            this.x = x1;
            xDifference = Math.abs(x2 - x1);
            yDifference = Math.abs(y2 - y1);
        }

        public double getY() {
            return y;
        }

        public double getX() {
            return x;
        }

        public double getXDifference() {
            return xDifference;
        }

        public double getYDifference() {
            return yDifference;
        }

        public boolean isBlade() {
            return id == 3522;
        }

        public boolean isArathiBasin() {
            return id == 3358;
        }

        public boolean isShatrhCity() {
            return id == 3703;
        }

        public boolean isAlterac() {
            return id == 2597;
        }

        public boolean isEye() {
            return id == 3820;
        }
    }
}
