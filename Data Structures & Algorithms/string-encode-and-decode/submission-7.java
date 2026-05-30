class Solution {
	public String encode(List<String> strs) {
		if(strs.size()==0){
			return "0";
		}
		StringBuffer enc = new StringBuffer();
		int count =0;
		for(String str: strs){
			StringBuffer sb = new StringBuffer();
			for(char c: str.toCharArray()){
				sb.append((int)c+"x");
			}
			if(count == strs.size()-1){
				enc.append(sb.toString());
			}else{
				enc.append(sb.toString()+"tt");
			}
			count++;
		}
		return enc.toString();
	}

	public List<String> decode(String str) {
		List<String> result = new ArrayList<String>();
		if(str.equals("0")){
			return result;
		}
		for(String s: str.split("tt")){
			StringBuffer sb = new StringBuffer();
			String[] chr = s.split("x");
			for(String c: chr){
				if(!c.equals(""))
					sb.append((char)Integer.parseInt(c)+"");
			}

			result.add(sb.toString());
		}

		return result;
	}
}
