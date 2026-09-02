(ns simple-billy-api.specs.warehouse-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.country-code :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def warehouse-update-data
  {
   (ds/opt :addressCity) string?
   (ds/opt :addressCountry) country-code-spec
   (ds/opt :addressStreet) string?
   (ds/opt :addressZip) string?
   (ds/opt :binLocations) any-type-spec
   (ds/opt :code) string?
   (ds/opt :isActive) boolean?
   (ds/opt :isDefault) boolean?
   (ds/opt :name) string?
   (ds/opt :notes) string?
   })

(def warehouse-update-spec
  (ds/spec
    {:name ::warehouse-update
     :spec warehouse-update-data}))
