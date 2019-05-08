package com.company.shopingram.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.shopingram.domain.dto.MemberDTO;
import com.company.shopingram.persistence.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper member;

	@Override
	public MemberDTO memberAdd(MemberDTO mem) {
		MemberDTO result = null;

		try {
			member.addMember(mem);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		result = mem;

		return result;
	}

	@Override
	public boolean memberDelete(String member_id, String member_pwd) {
		try {
			MemberDTO delete = new MemberDTO();
			delete.setMemberId(member_id);
			delete.setPwd(member_pwd);

			member.deleteMember(delete);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<MemberDTO> memberSearch(String name) {
		List<MemberDTO> searchList = null;

		try {
			searchList = member.searchMemberByName(name);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return searchList;
	}

	@Override
	public MemberDTO memberSearch(String memberId, int flag) {
		MemberDTO search = null;

		try {
			search = member.searchMemberById(memberId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return search;
	}

	/*
	 * memberSearch member의 ID와 pwd를 매개변수로 넘겨준다.
	 */
	@Override
	public MemberDTO memberSearch(String memberId, String pwd) {
		// TODO Auto-generated method stub
		MemberDTO search = null;
		try {

			Map<String, String> map = new HashMap<String, String>();
			map.put("member_id", memberId);
			map.put("member_pwd", pwd);

			search = member.searchMemberByIdAndPwd(map);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return search;
	}

	/*
	 * memberIdSearch member의 mail로 Id를 검색한다.
	 */
	@Override
	public String memberIdSearch(String mail) {
		String memberId = null;

		try {
			memberId = member.searchMemberId(mail);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return memberId;
	}

	/*
	 * memberPwdSearch member의 ID와 Mail을 세팅한 값을 매개변수로 넘겨야 한다.
	 */
	@Override
	public String memberPwdSearch(String memberId, String mail) {
		String pwd = null;

		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("member_id", memberId);
			map.put("member_mail", mail);

			pwd = member.searchMemberPwd(map);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return pwd;
	}

	@Override
	public MemberDTO memberLevelCodeUpdate(String memberId, String pwd, String levelCode) {
		// TODO Auto-generated method stub
		MemberDTO result = null;

		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("member_id", memberId);
			map.put("member_pwd", pwd);
			map.put("level_code", levelCode);

			member.updateMemberLevelCode(map);
			result = member.searchMemberById(memberId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return result;
	}

	@Override
	public MemberDTO memberRangeCodeUpdate(String memberId, String pwd, String rangeCode) {
		MemberDTO result = null;
		Map<String, String> map = new HashMap<String, String>();
		map.put("member_id", memberId);
		map.put("member_pwd", pwd);
		map.put("range_code", rangeCode);

		try {
			member.updateMemberRangeCode(map);
			result = member.searchMemberById(memberId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

	@Override
	public MemberDTO memberPwdUpdate(String memberId, String pwd, String newPwd) {
		MemberDTO result = null;

		try {
			Map<String, String> map = new HashMap<String, String>();
			map.put("memberId", memberId);
			map.put("pwd", pwd);
			map.put("newPwd", newPwd);

			member.updateMemberPwd(map);
			result = member.searchMemberById(memberId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;
	}

	@Override
	public MemberDTO memberUpdate(MemberDTO mem) {
		// TODO Auto-generated method stub
		MemberDTO result = null;

		try {
			member.updateMember(mem);
			result = mem;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return result;
	}

	@Override
	public String memberRegistSeller(String wrkrRegNo, String repName) {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1130000/SSVisitInfoService/getSSVisitBizRNoInfo"); /* URL */
		HttpURLConnection conn = null;
		BufferedReader rd = null;
		StringBuilder sb = null;
		try {
			urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
					+ "=qGpR%2F3OSOaVqnjLcWx0EgDBbBE33L53kQjsZzv9kDfRyiRSuP7xePXTvQIKXfZ2BlSHa1k00Pm5Nl0I4ryJizg%3D%3D"); /*
																															 * Service
																															 * Key
																															 */
			urlBuilder.append("&" + URLEncoder.encode("wrkrRegNo", "UTF-8") + "="
					+ URLEncoder.encode(wrkrRegNo, "UTF-8")); /* 사업자등록번호 */
			URL url = new URL(urlBuilder.toString());
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			// System.out.println("Response code: " + conn.getResponseCode());

			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			} else {
				rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "UTF-8"));
			}
			sb = new StringBuilder();

			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();
		} catch (Exception e) {
			System.out.println("member register seller 오류");
			e.printStackTrace();

		} finally {
			conn.disconnect();
		}

		StringTokenizer st = new StringTokenizer(sb.toString(), "<|>");

		// System.out.println("\nStringTokenizer 출력");
		boolean isRepNm = false;
		String repNm = null;
		while (st.hasMoreTokens()) {
			repNm = st.nextToken();
			if (repNm.equals("repNm")) {

				repNm = st.nextToken();
				break;
			}
			repNm = null;
		}
		
		return repNm;
	}
}
