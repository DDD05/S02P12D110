package com.ssafy.somebody.dao;

import java.util.List;

import com.ssafy.somebody.vo.Auction;

public interface AuctionDao {
    int insertAction(Auction auction);

    int updateAuction(Auction auction);

    int deleteAuction(String auctionId);

    Auction searchAuction(String auctionId);

    List<Auction> searchAuctionByTag(String tag);

    List<Auction> searchAuctionByMembers(String memberId);

    List<Auction> searchAllAuction();

    List<Auction> searchAllAuctionDesc();
}
