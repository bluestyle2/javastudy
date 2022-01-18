package aaa.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	
	List<BoardDTO> bblist(BoardDTO dto);
	
	BoardDTO detail(BoardDTO dto);
	
	int inserttt(BoardDTO dto);
	
	int insertGid(BoardDTO dto);	
	int insertGid2(BoardDTO dto);	
	int insertGid3(BoardDTO dto);	
	int insertGid4(BoardDTO dto);	
	int insertList(ArrayList<BoardDTO> arr);
	
	int insertList2(ArrDTO dto);
	
	int ddelete(BoardDTO dto);
	
	int modify(BoardDTO dto);
	
	int maxId();
}
