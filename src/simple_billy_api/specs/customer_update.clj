(ns simple-billy-api.specs.customer-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def customer-update-data
  {
   (ds/opt :address) any-type-spec
   (ds/opt :contactPerson) string?
   (ds/opt :email) string?
   (ds/opt :externalOrderNumber) string?
   (ds/opt :name) string?
   (ds/opt :paymentGracePeriodDays) int?
   (ds/opt :phone) string?
   (ds/opt :vatId) string?
   })

(def customer-update-spec
  (ds/spec
    {:name ::customer-update
     :spec customer-update-data}))
