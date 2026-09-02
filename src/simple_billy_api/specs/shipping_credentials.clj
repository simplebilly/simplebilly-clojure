(ns simple-billy-api.specs.shipping-credentials
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.dhl-credentials :refer :all]
            [simple-billy-api.specs.ups-credentials :refer :all]
            )
  (:import (java.io File)))


(def shipping-credentials-data
  {
   (ds/opt :dhl) dhl-credentials-spec
   (ds/opt :ups) ups-credentials-spec
   })

(def shipping-credentials-spec
  (ds/spec
    {:name ::shipping-credentials
     :spec shipping-credentials-data}))
