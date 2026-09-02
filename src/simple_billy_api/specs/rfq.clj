(ns simple-billy-api.specs.rfq
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.rfq-status :refer :all]
            )
  (:import (java.io File)))


(def rfq-data
  {
   (ds/opt :currency) string?
   (ds/req :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/req :requestedDate) inst?
   (ds/opt :responseDate) inst?
   (ds/req :rfqNumber) string?
   (ds/req :status) rfq-status-spec
   (ds/opt :supplierContactId) string?
   (ds/opt :supplierName) string?
   })

(def rfq-spec
  (ds/spec
    {:name ::rfq
     :spec rfq-data}))
