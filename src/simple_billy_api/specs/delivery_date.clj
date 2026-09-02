(ns simple-billy-api.specs.delivery-date
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.delivery-date-status :refer :all]
            )
  (:import (java.io File)))


(def delivery-date-data
  {
   (ds/opt :customerId) string?
   (ds/opt :fulfilledDate) inst?
   (ds/opt :note) string?
   (ds/req :orderNumber) string?
   (ds/opt :originalDate) inst?
   (ds/opt :productId) string?
   (ds/req :promisedDate) inst?
   (ds/req :status) delivery-date-status-spec
   })

(def delivery-date-spec
  (ds/spec
    {:name ::delivery-date
     :spec delivery-date-data}))
