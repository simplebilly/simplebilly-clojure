(ns simple-billy-api.specs.rfq-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.rfq-status :refer :all]
            )
  (:import (java.io File)))


(def rfq-update-data
  {
   (ds/opt :currency) string?
   (ds/opt :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :requestedDate) inst?
   (ds/opt :responseDate) inst?
   (ds/opt :rfqNumber) string?
   (ds/opt :status) rfq-status-spec
   (ds/opt :supplierContactId) string?
   (ds/opt :supplierName) string?
   })

(def rfq-update-spec
  (ds/spec
    {:name ::rfq-update
     :spec rfq-update-data}))
