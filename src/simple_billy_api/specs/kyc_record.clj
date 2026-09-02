(ns simple-billy-api.specs.kyc-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def kyc-record-data
  {
   (ds/opt :customerId) string?
   (ds/opt :customerName) string?
   (ds/opt :kycDate) inst?
   (ds/opt :notes) string?
   (ds/opt :retentionUntil) inst?
   (ds/opt :riskAssessment) string?
   })

(def kyc-record-spec
  (ds/spec
    {:name ::kyc-record
     :spec kyc-record-data}))
