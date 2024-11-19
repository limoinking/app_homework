package com.test.news.http;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

// TODO: 新闻-网络
public class News {

    /*{
	"reason":"success!",
	"result":{
		"stat":"1",
		"data":[
			{
				"uniquekey":"ffa17551467078c4800b390424e40c5d",
				"title":"首届“新部落”杯海南校园文学大奖赛正式启动",
				"date":"2024-11-5 20:09:00",
				"category":"头条",
				"author_name":"消费日报网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031200957477193553.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"16476cf3ed9092c4c78a42e2fe9cc5a4",
				"title":"总黄酮数值标注不实、“导师”冒充“高校教授” 远方好物回应：为设计人员疏忽、目前无法全面监管",
				"date":"2024-11-5 20:08:00",
				"category":"头条",
				"author_name":"消费日报网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031200831154931724.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200831_91dec91dd954a7d9655b64171455e28a_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200831_91dec91dd954a7d9655b64171455e28a_2_mwpm_03201609.jpeg",
				"thumbnail_pic_s03":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200831_91dec91dd954a7d9655b64171455e28a_3_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"9da86b71aab184f339002513023e4e63",
				"title":"王徵明：水意画的艺术传承",
				"date":"2024-11-5 20:08:00",
				"category":"头条",
				"author_name":"消费日报网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031200811992224123.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200811_63dc35a4a89e45be9a657a28a67571ef_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200811_63dc35a4a89e45be9a657a28a67571ef_2_mwpm_03201609.jpeg",
				"thumbnail_pic_s03":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200811_63dc35a4a89e45be9a657a28a67571ef_3_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"0248713a3ac418403a26f738c96a84db",
				"title":"塔斯汀汉堡“生肉门”背后 承认食品安全监管失职却“屡教不改”？",
				"date":"2024-11-5 20:07:00",
				"category":"头条",
				"author_name":"消费日报网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031200747432957738.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200747_f5ee05de5d90535dccd956d4982056aa_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200747_f5ee05de5d90535dccd956d4982056aa_2_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"9ac6a57adeb8d070c0e7440c7f09dd36",
				"title":"小叶医探 | 为新生儿“再造”气管，安徽首例婴幼儿气管成形手术顺利完成",
				"date":"2024-11-5 20:04:00",
				"category":"头条",
				"author_name":"大皖新闻",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031200442147778327.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200442_72ef85a2d2029128ff506ed7947da528_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031200442_72ef85a2d2029128ff506ed7947da528_2_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"a6dde9721600e810ab442e21ddef1a2d",
				"title":"太平人寿东营中支快速理赔助Z女士应对慢性肾病挑战",
				"date":"2024-11-5 19:59:00",
				"category":"头条",
				"author_name":"大众报业·齐鲁壹点",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031195951100350557.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"914db17005f46c5109a32ec7ba79b6e4",
				"title":"太平人寿东营中支快速理赔助90后白领抵御罕见病风险",
				"date":"2024-11-5 19:59:00",
				"category":"头条",
				"author_name":"大众报业·齐鲁壹点",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031195935795558445.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"a9861b0891c33350a85273dbc6018e30",
				"title":"太平人寿东营中支快速理赔助力Z女士战胜甲状腺恶性肿瘤",
				"date":"2024-11-5 19:58:00",
				"category":"头条",
				"author_name":"大众报业·齐鲁壹点",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031195816100606117.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"9c97d8907a69110a6741dd0716b62556",
				"title":"风雨中迎新生命！琼海多部门同心接力护送危急孕妇就医",
				"date":"2024-11-5 19:48:00",
				"category":"头条",
				"author_name":"南海网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031194853794960451.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031194853_a1a490326b4f9e5ea680698783eec30b_1_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"38c976c44ea000fea8a415f99631292d",
				"title":"琼海市中小学11月1日上午正常复课 幼儿园继续停课1天",
				"date":"2024-11-5 19:40:00",
				"category":"头条",
				"author_name":"南海网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031194025622561912.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"0f94d05553c2271ceb7aefdedecfa3ce",
				"title":"天柱公安抓获一名涉嫌销售假冒伪劣产品嫌疑人",
				"date":"2024-11-5 19:39:00",
				"category":"头条",
				"author_name":"当代先锋网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031193919597365326.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031193919_0435bddf1da013c464a39421028b5d89_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031193919_0435bddf1da013c464a39421028b5d89_2_mwpm_03201609.jpeg",
				"thumbnail_pic_s03":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031193919_0435bddf1da013c464a39421028b5d89_3_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"ce2c12e5cd54ead106a5bbfdcadcd937",
				"title":"唐山市气象台布大雾黄色预警！",
				"date":"2024-11-5 19:31:00",
				"category":"头条",
				"author_name":"岛民观察",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031193128236244983.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"9d262a7095c8d790990dff2770e7d878",
				"title":"蒙自市停电公告！",
				"date":"2024-11-5 19:31:00",
				"category":"头条",
				"author_name":"岛民观察",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031193111767130706.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/minimodify\/20241031\/660x882_67236a31e7602_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"e7d048355d5f4daf89bd0d8b3516de0f",
				"title":"信阳通报10起典型案例！",
				"date":"2024-11-5 19:30:00",
				"category":"头条",
				"author_name":"岛民观察",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031193049199286626.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"1a06a3bc0ce46a91bbdc8672bb9b7d45",
				"title":"定远警方“合成作战” 严厉打击侵财犯罪",
				"date":"2024-11-5 19:30:00",
				"category":"头条",
				"author_name":"大皖新闻",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031193043065349313.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"908455f3c91af8ac2a07fb39b5552bcd",
				"title":"海口甲子派出所民警闻“汛”而动 紧急救援被困群众",
				"date":"2024-11-5 18:43:00",
				"category":"头条",
				"author_name":"南海网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031184356772542874.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031184356_0543ea4bd8372a0a38713da43247d871_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031184356_0543ea4bd8372a0a38713da43247d871_2_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"b0746d350820fec7792fdad781a5e888",
				"title":"问政海南 | 陵水一道路施工无警示牌致路过车辆受损，谁的责任？交警回应→",
				"date":"2024-11-5 18:39:00",
				"category":"头条",
				"author_name":"南海网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031183936331243000.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031183936_d4369d4063341ceeec79a82ac272bda3_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031183936_d4369d4063341ceeec79a82ac272bda3_2_mwpm_03201609.jpeg",
				"thumbnail_pic_s03":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031183936_d4369d4063341ceeec79a82ac272bda3_3_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"4a23cbf052f104d38ec6711f1ab6e59f",
				"title":"合同年底到期！博主：刘殿座已离开武汉，肯定不会参加中超收官战",
				"date":"2024-11-5 18:30:00",
				"category":"头条",
				"author_name":"篮板咋烂篮筐",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031183052206439643.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/minimodify\/20241031\/750x500_67235c0e4dd5b_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"a14ecb15c61faa99c937955b9a2ef582",
				"title":"为何要“木桃报琼瑶”？",
				"date":"2024-11-5 18:15:00",
				"category":"头条",
				"author_name":"大众网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031181559219580220.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031181559_a2a56f33777e71ad11d4d7bfac076d53_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031181559_a2a56f33777e71ad11d4d7bfac076d53_2_mwpm_03201609.jpeg",
				"thumbnail_pic_s03":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031181559_a2a56f33777e71ad11d4d7bfac076d53_3_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"0023e8b049d9e14dd9cd8a5c96cfa5c3",
				"title":"大风记者帮|新小区仅有一家宽带还被“封”了 咋回事？官方回应",
				"date":"2024-11-5 18:14:00",
				"category":"头条",
				"author_name":"华商网-华商报",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031181449803598063.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"cfa46cb6171ebe7d7c4c079cfe674b86",
				"title":"潍坊公交：热情助人暖人心，拾金不昧显真情",
				"date":"2024-11-5 18:13:00",
				"category":"头条",
				"author_name":"大众网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031181317579700719.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031181317_027420523474b5c735648638f2502451_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031181317_027420523474b5c735648638f2502451_2_mwpm_03201609.jpeg",
				"thumbnail_pic_s03":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031181317_027420523474b5c735648638f2502451_3_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"88cab5ec89f98a45e6f6b3278efa9af1",
				"title":"沪昆高速连环追尾！救援：与时间赛跑",
				"date":"2024-11-5 18:08:00",
				"category":"头条",
				"author_name":"人民网－贵州频道，供稿：人民资讯",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031180803844165270.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031180803_3bccc7e0e43977341ffcf6612a39dabc_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031180803_3bccc7e0e43977341ffcf6612a39dabc_2_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"be4d27c32fb01dca3c643e3498bbe445",
				"title":"大车超限冲关 执法：果断出击",
				"date":"2024-11-5 18:08:00",
				"category":"头条",
				"author_name":"人民网－贵州频道，供稿：人民资讯",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031180803786145265.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031180803_758cbb1dc8b4ce91bc607dfc91d85e23_1_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"b5a249d9ae9f3b1043794bbf8977bf9e",
				"title":"女子高速突遇车辆追尾事故 民警有条不紊安抚并指挥交通",
				"date":"2024-11-5 18:07:00",
				"category":"头条",
				"author_name":"当代先锋网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031180738093850756.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"9ca1447153a4e250aa4edef1bce0e84f",
				"title":"危难时刻显身手！点赞潍坊公交人",
				"date":"2024-11-5 18:07:00",
				"category":"头条",
				"author_name":"大众网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031180727212735165.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031180727_8fb3f24d7f67a34ea8ac71e0b274cfd4_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031180727_8fb3f24d7f67a34ea8ac71e0b274cfd4_2_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"299a45ddd3179b63d48163a7293bebf7",
				"title":"首届世界古典学大会丨“世界古典学大会·走读中国之中原行”活动将于11月3日正式启动",
				"date":"2024-11-5 18:01:00",
				"category":"头条",
				"author_name":"大河网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031180123355559146.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031180123_6d35e87fec64619c4b7a40263627dbb8_1_mwpm_03201609.jpeg",
				"thumbnail_pic_s02":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031180123_6d35e87fec64619c4b7a40263627dbb8_2_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"08bb7b30279312a5639007d356455440",
				"title":"成都蒲江村警助力村民解除”马蜂危机“",
				"date":"2024-11-5 17:57:00",
				"category":"头条",
				"author_name":"人民网－四川频道，供稿：人民资讯",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031175733378835082.html",
				"thumbnail_pic_s":"",
				"is_content":"1"
			},
			{
				"uniquekey":"0e9f5416334470d24139c57f98ebef49",
				"title":"二十余载初心不改 卓越服务使命担当——记上河桥营服中心小CEO仉茜茜",
				"date":"2024-11-5 17:54:00",
				"category":"头条",
				"author_name":"鲁网",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031175419244466926.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031175419_841db1ef08ec3434df61f658bd29f41c_1_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"bf7f59dfc8a8b375986be09a9aa76e0d",
				"title":"湖南衡阳一地河边发现尸体 当地官方回应",
				"date":"2024-11-5 17:44:00",
				"category":"头条",
				"author_name":"大皖新闻",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031174433576714763.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031174433_91f48df9ed060458bc1d4fecccbbc172_1_mwpm_03201609.jpeg",
				"is_content":"1"
			},
			{
				"uniquekey":"9e528b7b367a87660001796773a1bcce",
				"title":"浙江援藏干部余风诗集《从0到5000米——一位援藏人的雪域诗路》出版",
				"date":"2024-11-5 17:42:00",
				"category":"头条",
				"author_name":"浙江在线",
				"url":"https:\/\/mini.eastday.com\/mobile\/241031174225024167839.html",
				"thumbnail_pic_s":"https:\/\/dfzximg02.dftoutiao.com\/news\/20241031\/20241031174225_287461fdc830aaebe2e9592be86f2395_1_mwpm_03201609.jpeg",
				"is_content":"1"
			}
		],
		"page":"1",
		"pageSize":"30"
	},
	"error_code":0
}*/

    private String reason;
    private Result result;

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

    public class Result{

        private String stat;
        private List<Data> data;

        public void setStat(String stat) {
            this.stat = stat;
        }

        public String getStat() {
            return stat;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }

        public List<Data> getData() {
            return data;
        }

        public class Data implements Serializable {

            private String uniquekey;
            private String title;
            private Date date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;
            private String is_content;

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTitle() {
                return title;
            }

            public void setDate(Date date) {
                this.date = date;
            }

            public Date getDate() {
                return date;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getCategory() {
                return category;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setIs_content(String is_content) {
                this.is_content = is_content;
            }

            public String getIs_content() {
                return is_content;
            }

        }
    }
}