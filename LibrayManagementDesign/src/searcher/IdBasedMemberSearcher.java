/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcher;

import java.util.List;
import user.Member;

/**
 *
 * @author HP
 */
public class IdBasedMemberSearcher implements MemberSearcher{

    private final int memberid;

    public IdBasedMemberSearcher(int memberid) {
        this.memberid = memberid;
    }
    
    @Override
    public List<Member> search() {
        // perform search based on memberid 
        return null;
    }
    
}
