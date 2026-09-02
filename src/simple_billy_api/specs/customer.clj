(ns simple-billy-api.specs.customer
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def customer-data
  {
   (ds/opt :address) any-type-spec
   (ds/opt :contactPerson) string?
   (ds/opt :email) string?
   (ds/opt :externalOrderNumber) string?
   (ds/req :name) string?
   (ds/opt :paymentGracePeriodDays) int?
   (ds/opt :phone) string?
   (ds/opt :vatId) string?
   })

(def customer-spec
  (ds/spec
    {:name ::customer
     :spec customer-data}))
