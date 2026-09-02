(ns simple-billy-api.specs.legal-doc-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def legal-doc-type-data
  {
   })

(def legal-doc-type-spec
  (ds/spec
    {:name ::legal-doc-type
     :spec legal-doc-type-data}))
