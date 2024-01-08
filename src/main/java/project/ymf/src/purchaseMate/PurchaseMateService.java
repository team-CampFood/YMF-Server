package project.ymf.src.purchaseMate;

import org.springframework.stereotype.Service;
import project.ymf.common.result.ResultCode;
import project.ymf.src.purchaseMate.dto.*;

import java.util.List;

@Service
public class PurchaseMateService {
    public void postPurchase(PurchaseMateRequest request) {
    }

    public void editPurchase(Long purchaseId, PurchaseMateRequest request) {
    }

    public PurchaseMateInfoDTO getPurchaseInfo(Long purchaseId) {
    }

    public ResultCode applyPurchase(Long purchaseId, PurchaseMateApplyRequest request) {
    }

    public void deletePurchase(Long purchaseId) {
    }

    public void completePurchase(Long purchaseId) {
    }

    public List<PurchaseMateApplyDTO> getPurchaseSubs(Long purchaseId) {
    }

    public ResultCode acceptPurchase(Long purchaseId, PurchaseMateAcceptRequest request) {
    }

    public List<PurchaseMateDTO> getAllPurchase() {
    }

    public List<PurchaseMateDTO> getSearchedPurchase(String keyword) {
    }

    public List<PurchaseMateDTO> getMyPurchase() {
    }
}
