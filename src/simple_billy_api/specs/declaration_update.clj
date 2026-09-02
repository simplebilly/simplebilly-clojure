(ns simple-billy-api.specs.declaration-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.declaration-type :refer :all]
            )
  (:import (java.io File)))


(def declaration-update-data
  {
   (ds/opt :declarationType) declaration-type-spec
   (ds/opt :isCurrent) boolean?
   (ds/opt :text) string?
   (ds/opt :validFrom) inst?
   (ds/opt :version) string?
   })

(def declaration-update-spec
  (ds/spec
    {:name ::declaration-update
     :spec declaration-update-data}))
