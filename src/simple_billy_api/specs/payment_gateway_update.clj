(ns simple-billy-api.specs.payment-gateway-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.gateway-type :refer :all]
            )
  (:import (java.io File)))


(def payment-gateway-update-data
  {
   (ds/opt :config) any-type-spec
   (ds/opt :createdAt) inst?
   (ds/opt :deletedAt) inst?
   (ds/opt :enabled) boolean?
   (ds/opt :gatewayType) gateway-type-spec
   (ds/opt :label) string?
   (ds/opt :updatedAt) inst?
   })

(def payment-gateway-update-spec
  (ds/spec
    {:name ::payment-gateway-update
     :spec payment-gateway-update-data}))
