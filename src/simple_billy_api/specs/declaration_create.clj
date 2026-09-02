(ns simple-billy-api.specs.declaration-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.declaration-type :refer :all]
            )
  (:import (java.io File)))


(def declaration-create-data
  {
   (ds/opt :declarationType) declaration-type-spec
   (ds/opt :isCurrent) boolean?
   (ds/opt :text) string?
   (ds/opt :validFrom) inst?
   (ds/opt :version) string?
   })

(def declaration-create-spec
  (ds/spec
    {:name ::declaration-create
     :spec declaration-create-data}))
