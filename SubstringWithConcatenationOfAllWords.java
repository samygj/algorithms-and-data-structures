package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class SubstringWithConcatenationOfAllWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] L = {"pbolvrtdfefhqxcrrofyc","mewjykbnzjeazrxrkayoh","fgekzwyewctbyczidokos","kojihvkflslryxruvxrzq","uytvgyjsndddmnkhzrstc","lsbeowchwsbwnwemhxbkc","gwpqfqjzmmlenpumrckmd","gzcmnjjqulwscoytyxhkk","lzahntjzfphhruwadnwpj","ptypmwovizijzqzuzycog","jhahkdugugxoemccbymag","vbyuxytzobkwbsigoobuo","raatedrqfamiyigydhpes","lhmvoajrxzixabcfvslxg","vvpbwujlzdygptureloet","ogxslsmyrtuokxkeivflv","mcoiutwkzryfoqsidtzyp","qkmaqxywktknisjdoteis","jykdhpyipnyzcbqzzolsy","ycsjfjdjrxupjayzyhqoh","qqiirjyccwdgoomxtxqqu","gcwedwntkxlcfvvrtatpf","bgtnfnnwfjchfikdwgotr","sanorgqmyvoeqdldshldl","siufoslencwprmhyevwzl","cqrpvlzgpkbzggnytrnxq"};
//		ArrayList<Integer> a = findSubstring("dlmogiklbqfggokuonfgugiyammwvwhbjvrqgdbjtipcwzwmobtjjdhmpvknrsqbpjtvmwfifukbwgokjjvvmeheatttljwdupygofotcywygmksvipkmyqmrjifueiouiukoldqlzquocojkdvzdlnuuvbqajewubgiolazmsvaujmfohervtorppipbolvrtdfefhqxcrrofycmewjykbnzjeazrxrkayohfgekzwyewctbyczidokoskojihvkflslryxruvxrzquytvgyjsndddmnkhzrstclsbeowchwsbwnwemhxbkcgwpqfqjzmmlenpumrckmdgzcmnjjqulwscoytyxhkklzahntjzfphhruwadnwpjptypmwovizijzqzuzycogjhahkdugugxoemccbymagvbyuxytzobkwbsigoobuoraatedrqfamiyigydhpeslhmvoajrxzixabcfvslxgvvpbwujlzdygptureloetogxslsmyrtuokxkeivflvmcoiutwkzryfoqsidtzypqkmaqxywktknisjdoteisjykdhpyipnyzcbqzzolsyycsjfjdjrxupjayzyhqohqqiirjyccwdgoomxtxqqugcwedwntkxlcfvvrtatpfbgtnfnnwfjchfikdwgotrsanorgqmyvoeqdldshldlsiufoslencwprmhyevwzlcqrpvlzgpkbzggnytrnxqdpekpjhnivraogwzfeoqfoynbzgvmelpvpbkyjxjgojuwhtcmkurysfbrnwerjvozxazixionukkbfonpihpcorwbpcvzxjaukzejksxeejhkxxzhgpjuihvxjqyhaydmaivkcuqhdztcyulelvyteutokrxmscasmwepswyyxrawnmazjbsnvndhfcwzfwrruxinvilsbnopbroksiapwfydkwcptvipstepbphffyugrktlsvaqaatkxxbssmhmhmbidjpijjravklofnghnaumxvesjoeqcibhtqsccjextpnaeuhtwdgvbknkaubccemvuezyndwiujkyftrbxxzykmkkilpkrdhohgmwjigduqdbjvdgueggqrtbeknwnvkubysnjysdowgztjipnowghpjmbwkorwkvuckfaciqaprvazlqqjyxahlbdxpxvzusdexfiivlzogbotrgerfeathgqydmxzgcddhnleykthmjcfphzwnzpvfgtkutjavoffcrjcdejrpoxevydkxsffabruwbwtrcytvkyyqhqgvpmsnpdmiktinlflmdffffzcrxbigtqeicyxudlcofmdqtpexwjebkhtjidsdtwlvwkpavtqaitsbkyagifiumdewgwzzumwqyoqtjgwrcqvmpvtzadtogxmmvnlrzjixxathjpylhvzwruvtxpkdowrmkedlonjloeuxtvkcqjzjeuddlnhalamvfrhvfsitwdsryetqnu", L);
		String[] L = {"fooo","barr","wing","ding","wing"};
		ArrayList<Integer> a = findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", L);
		System.out.println(a);
	}
	
	public static ArrayList<Integer> findSubstring(String S, String[] L) {
        int sLen = S.length();
        int lLen = L.length;
        int wLen = L[0].length();
        HashMap<String, Integer> lhm = new HashMap<String, Integer>();
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (String p : L)
            lhm.put(p, 1);
        for (int i = 0; i < sLen; i++) {
            HashMap<String, Integer> shm = new HashMap<String, Integer>();
            int j = i;
            while (j < sLen-wLen) {
                String temp = S.substring(j,j+wLen);
                if (lhm.containsKey(temp)) {
                    if (shm.containsKey(temp))
                        break;
                    else
                        shm.put(temp, 1);
                } else
                	break;
                if (shm.size() == lLen)
                    x.add(i);
                j += wLen;
            }
        }
        return x;
    }

}
