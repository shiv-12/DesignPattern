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
public class NameBasedMemberSearcher implements MemberSearcher {

    private final String memberName;

    public NameBasedMemberSearcher(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public List<Member> search() {
        return null;
    }

}
