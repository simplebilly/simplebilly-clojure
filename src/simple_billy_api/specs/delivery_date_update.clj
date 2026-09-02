(ns simple-billy-api.specs.delivery-date-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.delivery-date-status :refer :all]
            )
  (:import (java.io File)))


(def delivery-date-update-data
  {
   (ds/opt :customerId) string?
   (ds/opt :fulfilledDate) inst?
   (ds/opt :note) string?
   (ds/opt :orderNumber) string?
   (ds/opt :originalDate) inst?
   (ds/opt :productId) string?
   (ds/opt :promisedDate) inst?
   (ds/opt :status) delivery-date-status-spec
   })

(def delivery-date-update-spec
  (ds/spec
    {:name ::delivery-date-update
     :spec delivery-date-update-data}))
