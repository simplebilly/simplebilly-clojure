(ns simple-billy-api.specs.kyc-record-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def kyc-record-update-data
  {
   (ds/opt :customerId) string?
   (ds/opt :customerName) string?
   (ds/opt :kycDate) inst?
   (ds/opt :notes) string?
   (ds/opt :retentionUntil) inst?
   (ds/opt :riskAssessment) string?
   })

(def kyc-record-update-spec
  (ds/spec
    {:name ::kyc-record-update
     :spec kyc-record-update-data}))
