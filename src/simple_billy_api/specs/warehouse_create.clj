(ns simple-billy-api.specs.warehouse-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.country-code :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def warehouse-create-data
  {
   (ds/opt :addressCity) string?
   (ds/opt :addressCountry) country-code-spec
   (ds/opt :addressStreet) string?
   (ds/opt :addressZip) string?
   (ds/opt :binLocations) any-type-spec
   (ds/req :code) string?
   (ds/opt :isActive) boolean?
   (ds/opt :isDefault) boolean?
   (ds/req :name) string?
   (ds/opt :notes) string?
   })

(def warehouse-create-spec
  (ds/spec
    {:name ::warehouse-create
     :spec warehouse-create-data}))
